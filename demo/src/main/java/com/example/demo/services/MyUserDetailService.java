package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repositories.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String identifier) throws UsernameNotFoundException {
	    Users user = userRepo.findByUsernameOrEmailOrPhoneNumber(identifier, identifier, identifier)
	        .orElseThrow(() -> new UsernameNotFoundException("User not found with identifier: " + identifier));
	    return new org.springframework.security.core.userdetails.User(
	        user.getUsername(),
	        user.getPassword(),
	        new ArrayList<>() // Authorities
	    );
	}
	
}
