package com.restaurapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.restaurapp.app.dao.UserDAO;
import com.restaurapp.app.entity.Autentifikacija;
import com.restaurapp.app.entity.Zaposleni;

@Controller
public class LoginController {
	
	@Autowired
	private UserDAO userDAO;

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	
	@GetMapping("/registration")
	public String showRegistrationPage(Model model) {
		model.addAttribute("user",new Autentifikacija());
		return "registration";
	}
	
	@PostMapping("/registrationProcess")
	public String processRegistration(@RequestParam("username") String username,@RequestParam("password") String password,Model model, RedirectAttributes ra) {
		String putanja="";
		
		String rezultat=userDAO.registration(username, password);
		
		if(rezultat.equals("Korisničko ime već postoji.")){
			putanja="redirect:/";
			ra.addFlashAttribute("poruka", rezultat);
		}
		else if(rezultat.equals("Uspesno")) {
			putanja="registration-2";
		}
		else {
			putanja="redirect:/";
			ra.addFlashAttribute("poruka","Nesto drugo.");
		}
		
		model.addAttribute("username", username);
		return putanja;
	}
	
	@GetMapping("/registration-2")
	public String furtherRegistration(Model model) {
		model.addAttribute("employee", new Zaposleni());
		return "registration-2";
	}
	
	@PostMapping("/registrationProcessFinal")
	public String finalRegistrationProcess(@RequestParam("idKred") String idKred,@RequestParam("name") String name, @RequestParam("surname")
	String surname, RedirectAttributes ra) {
		
		String rezultat=userDAO.registrationFinalization(idKred, name, surname);
		
		if(rezultat.equals("Uspesno")) {
			rezultat="Uspešno registrovanje.";
		}
		else {
			rezultat="Neuspešno registrovanje.";
		}
		
		System.out.println(rezultat);
		
		ra.addFlashAttribute("poruka", rezultat);
		
		return "redirect:/";
	}
	
	
	
}
