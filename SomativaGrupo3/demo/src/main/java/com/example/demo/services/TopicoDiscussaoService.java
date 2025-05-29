package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.TopicoDiscussao;
import com.example.demo.repositories.TopicoDiscussaoRepositorio;

@Service
public class TopicoDiscussaoService {
	
		
		private final TopicoDiscussaoRepositorio topicoDiscussaoRepository;
		
		public TopicoDiscussaoService(TopicoDiscussaoRepositorio topicoDiscussaoRepository) {
			
			this.topicoDiscussaoRepository = topicoDiscussaoRepository;
		}
		
		public TopicoDiscussao saveTopicoDiscussao(TopicoDiscussao topicoDiscussao) {
			
			return topicoDiscussaoRepository.save(topicoDiscussao);
		}
		
		public TopicoDiscussao getTopicoDiscussaoById(Long id) {
			return topicoDiscussaoRepository.findById(id).orElse(null);
		}
		
		public List<TopicoDiscussao> getAllTopicoDiscussao(){
			return topicoDiscussaoRepository.findAll();
		}
		
		public void deleteTopicoDiscussao(Long id) {
			topicoDiscussaoRepository.deleteById(id);

		}
		
		public List<TopicoDiscussao> getTopicoDiscussaoByForum(String tituloForum) {
			return topicoDiscussaoRepository.findTopicoDiscussaoByForum(tituloForum);
		}
		

	}
