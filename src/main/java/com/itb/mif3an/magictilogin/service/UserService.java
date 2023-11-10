package com.itb.mif3an.magictilogin.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.itb.mif3an.magictilogin.model.Role;
import com.itb.mif3an.magictilogin.model.User;
import com.itb.mif3an.magictilogin.web.dto.UserDto;

public interface UserService extends UserDetailsService{
	
	User save(UserDto userDto);
	User findByEmail(String email);
	User update(UserDto userDto);
	void addRoleToUser(String username, String roleName);
	Role saveRole(Role role);
	User getAuthenticatedUser();
	List<User> findAllUsersByExceptPrincipalRole(String principalRole);
	User saveUser(User user);
	List<Role> findAllRoles();
	User findUserById(Long Id);
	

}
