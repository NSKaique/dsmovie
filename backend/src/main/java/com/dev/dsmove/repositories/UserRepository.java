package com.dev.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dsmove.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
