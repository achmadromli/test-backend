package com.test.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.backend.entities.Position;
import com.test.backend.repositories.PositionRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PositionController {

	@Autowired
	private PositionRepository positionRepository;
	
	@GetMapping("/positions")
	public List<Position> getEmployees() {
		return positionRepository.findAll();
	}
	
	@GetMapping("/position/{id}")
	public Position getPosition(@PathVariable Long id) {
		return positionRepository.getOne(id);
	}
	
	@DeleteMapping("/position/{id}")
	public boolean deletePosition(@PathVariable Long id) {
		positionRepository.deleteById(id);
		return true;
	}
	
	@PostMapping("/position")
	public Position createPosition(Position position) {
		return positionRepository.save(position);
	}
	
	@PutMapping("/position")
	public Position updatePosition(Position position) {
		return positionRepository.save(position);
	}
	
}
