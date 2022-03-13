package com.dev.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dsmove.entity.Score;
import com.dev.dsmove.entity.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
