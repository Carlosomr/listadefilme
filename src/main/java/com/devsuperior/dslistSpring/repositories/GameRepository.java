package com.devsuperior.dslistSpring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}