package com.restaurapp.app.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import com.microsoft.sqlserver.jdbc.SQLServerException;

@Repository
public class UserImpl implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public String registration(String username, String password) {
		Session session=sessionFactory.getCurrentSession();
		
		String rezultat=null;
		
		rezultat=session.doReturningWork(new ReturningWork<String>(){
			@Override
			public String execute(Connection connection) throws SQLException {

				String hashPassword="{bcrypt}"+BCrypt.hashpw(password,BCrypt.gensalt());
				hashPassword+=BCrypt.hashpw(password,BCrypt.gensalt());
				String rez="";
				CallableStatement cstmt=null;
				try {
					String sqlString="{call dodajKorisnika (?,?,?,?)}";
					cstmt = connection.prepareCall(sqlString);
					cstmt.setString(1, username);
					cstmt.setString(2, hashPassword);
					cstmt.setString(3, "WAITER");
					cstmt.registerOutParameter(4, java.sql.Types.NVARCHAR);

					cstmt.executeUpdate();
					rez=cstmt.getString(4);
				} 
				catch(SQLServerException ex) {
					ex.printStackTrace();
					rez="Korisničko ime već postoji.";
				}
				finally {
					cstmt.close();
				}
				return rez;
			}
			
		});
		
		return rezultat;
		
	}

	@Override
	@Transactional
	public String registrationFinalization(String username,String name, String surname) {
		String rezultat=null;
		Session session=sessionFactory.getCurrentSession();
		
		rezultat=session.doReturningWork(new ReturningWork<String>(){
			@Override
			public String execute(Connection connection) throws SQLException {

				String rez="";
				CallableStatement cstmt=null;
				try {
					String sqlString="{call dodajZaposlenog2 (?,?,?,?)}";
					cstmt = connection.prepareCall(sqlString);
					cstmt.setString(1, username);
					cstmt.setString(2, name);
					cstmt.setString(3, surname);
					cstmt.registerOutParameter(4, java.sql.Types.NVARCHAR);

					cstmt.executeUpdate();
					rez=cstmt.getString(4);
				} 
				catch(SQLServerException ex) {
					//ex.printStackTrace();
					rez="Došlo je do greške sa bazom podataka.";
				}
				finally {
					cstmt.close();
				}
				return rez;
			}
			
		});
		
		
		return rezultat;
	}

}
