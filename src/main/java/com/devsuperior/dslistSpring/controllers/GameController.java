package com.devsuperior.dslistSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslistSpring.Services.GameService;
import com.devsuperior.dslistSpring.dto.GameDTO;
import com.devsuperior.dslistSpring.dto.GameMinDTO;
import com.devsuperior.dslistSpring.entities.Game;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result; 
	}
	@GetMapping
	public List<GameMinDTO> findall(){
		List<GameMinDTO> result = gameService.findall();
		return result; 
	}
	}
