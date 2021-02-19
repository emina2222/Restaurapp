package com.restaurapp.app.dao;

public interface UserDAO {

	public String registration(String username,String password);
	public String registrationFinalization(String username,String name, String surname);
}
