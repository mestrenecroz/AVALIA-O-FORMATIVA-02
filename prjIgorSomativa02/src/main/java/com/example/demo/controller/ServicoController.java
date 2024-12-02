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

import com.example.demo.entities.Servico;
import com.example.demo.service.AnimalService;
import com.example.demo.service.ServicoService;

@RestController
	@RequestMapping("/servico")
	public class ServicoController {

	private final ServicoService servicoService;
	
	@Autowired
    public ServicoController(ServicoService servicoService) {
    	this.servicoService = servicoService;
    }

			@PostMapping("/create")
			public Servico createServico(@RequestBody Servico servico) {
				return servicoService.saveServico(servico);
			}

			@GetMapping
			public List<Servico> getAllServico() {
				return servicoService.getAllServico();
			}

			@GetMapping("/{id}")
			public Servico getServico(@PathVariable Long id) {
				return servicoService.getServicoById(id);
			}

			@DeleteMapping("/{id}")
			public void deleteServico(@PathVariable Long id) {
				servicoService.deleteServico(id);
			}
		}

