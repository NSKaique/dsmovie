package com.dev.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dsmove.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
