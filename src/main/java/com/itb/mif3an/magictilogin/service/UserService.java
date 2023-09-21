package com.itb.mif3an.magictilogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.itb.mif3an.magictilogin.model.Role;
import com.itb.mif3an.magictilogin.model.User;
import com.itb.mif3an.magictilogin.web.dto.UserDto;

public interface UserService extends UserDetailsService{
	
	User save(UserDto userDto);
	User findByEmail(String email);
	void addRoleToUser(String username, String roleName);
	Role saveRole(Role role);
	User getAuthenticatedUser();

}
