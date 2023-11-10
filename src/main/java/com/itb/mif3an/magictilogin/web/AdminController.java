package com.itb.mif3an.magictilogin.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itb.mif3an.magictilogin.model.Role;
import com.itb.mif3an.magictilogin.model.User;
import com.itb.mif3an.magictilogin.service.UserService;
import com.itb.mif3an.magictilogin.web.dto.UserDto;

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

		User user = userService.getAuthenticatedUser();
		String username = user.getEmail();
		List<User> usuarios = userService.findAllUsersByExceptPrincipalRole("ROLE_ADMIN");
		model.addAttribute("username", username);
		model.addAttribute("usuarios", usuarios);
		
		return "lista-usuarios-admin";
	}
	
	@GetMapping("/usuarios/editar-user/{id}")
	public String showUpdateFormUser(@PathVariable("id") Long id, Model model) {
		User user = userService.getAuthenticatedUser();
		List<Role> roles = userService.findAllRoles();
		String username = user.getEmail();
		
		User userDb = userService.findUserById(id);
		
		model.addAttribute("usuario", userDb);
		model.addAttribute("allRoles", roles);
		model.addAttribute("username", username);
		
		return"update-usuario";
	}
	
	@PostMapping("/usuarios/update-principal-role/id")
	public String updatePrincipalRoleUser(@ModelAttribute("user") UserDto userDto, 
											@PathVariable("id") Long id,
											Model model,
											@RequestParam(value ="roleName", required = false) String roleName){ 
		
		User user = userService.getAuthenticatedUser();
		return "";
	}
	
}
