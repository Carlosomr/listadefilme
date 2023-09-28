package com.devsuperior.dslistSpring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslistSpring.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}