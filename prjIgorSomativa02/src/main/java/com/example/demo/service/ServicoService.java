package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Servico;
import com.example.demo.repository.ServicoRepository;

@Service
public class ServicoService {	
			
		    @Autowired
		    private  ServicoRepository  servicoRepository;
		    
		    public List<Servico> getAllServico() {
		        return  servicoRepository.findAll();
		    }

			public Servico saveServico(Servico servico) {
				return  servicoRepository.save(servico);
			}

			public Servico getServicoById(Long id) {
				return  servicoRepository.findById(id).orElse(null);
			}

			public void deleteServico(Long id) {
				 servicoRepository.deleteById(id);
			}

		}
