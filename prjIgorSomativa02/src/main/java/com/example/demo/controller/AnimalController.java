package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Animal;
import com.example.demo.repository.AnimalRepository;
import com.example.demo.service.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

		private final AnimalService animalService;
		
		@Autowired
	    public AnimalController(AnimalService animalService) {
	    	this.animalService = animalService;
	    }

		@PostMapping("/create")
		public Animal createAnimal(@RequestBody Animal animal) {
			return animalService.saveAnimal(animal);
		}
		
		@GetMapping
		public List<Animal> getAllAnimal() {
			return animalService.getAllAnimal();
		}

		@GetMapping("/{id}")
		public Animal getAnimal(@PathVariable Long id) {
			return animalService.getAnimalById(id);
		}
	}
