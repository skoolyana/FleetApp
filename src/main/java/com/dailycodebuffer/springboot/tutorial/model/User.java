package com.dailycodebuffer.springboot.tutorial.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.dailycodebuffer.springboot.tutorial.security.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Id
	  private int id;
	
	  private String firstname;
	  private String lastname;
	  private String username;
	  private String password;

	  
	  @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	    @JoinTable(
	            name = "user_role",
	            joinColumns = {
	            		
	            		@JoinColumn(name = "user_id")
	            		
	            },
	            inverseJoinColumns = {
	            		
	            		@JoinColumn(name = "role_id")
	            		
	            }
	    )
	  
	  Set<Role> roles = new HashSet();
	  
	  
	
}
