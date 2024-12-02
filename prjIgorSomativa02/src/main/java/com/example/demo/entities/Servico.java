package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servico")
public class Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Long preco;
	
	public Long getId() {
		return id;
	}
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public String  getStatus() {
		 return nome;
	 }
	 public String  setStatus(String nome) {
		 return this.nome = nome;
	 }
	 
	 public Long getData() {
		 return preco;
	 }
	 public void  setData(Long preco) {
		 this.preco = preco;
	 }
}
