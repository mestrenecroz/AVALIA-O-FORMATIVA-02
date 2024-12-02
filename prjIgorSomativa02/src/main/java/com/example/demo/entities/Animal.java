package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		private String nome;
		
		private int idade;
		
		private String tipo;
		
		public Long getId() {
			return id;
		}
		 public void setId(Long id) {
			 this.id = id;
		 }
		 public int getIdade() {
			 return idade;
		 }
		 public void  setIdade(int idade) {
			 this.idade = idade;
		 }
		 
		 public String getTipo() {
			 return tipo;
		 }
		 public void  setTipo(String tipo) {
			 this.tipo = tipo;
		 }
		 
		 public String getNome() {
			 return nome;
		 }
		 public void  setNome(String nome) {
			 this.nome = nome;
		 }
	}
