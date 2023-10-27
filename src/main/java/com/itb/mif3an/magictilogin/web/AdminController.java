package com.itb.mif3an.magictilogin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.mif3an.magictilogin.model.User;
import com.itb.mif3an.magictilogin.service.UserService;

@Controller
//@RequestMapping("/MagicTI/admin") (nome-do-projeto/model manipulado)
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String homeAdmin(Model model) {
		
		String home = "index-admin";
		User user = userService.getAuthenticatedUser();
		String username = user.getEmail();
		model.addAttribute("username", username);
		return home;
		
	}
	@GetMapping("/usuarios/todos-usuarios")
	public String showUsuarios(Model model) {

		return "";
	}
	
	
	
}