package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.TopicoDiscussao;
import com.example.demo.services.TopicoDiscussaoService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/topicoDiscussao")
public class TopicoDiscussaoController {


		private final TopicoDiscussaoService topicoDiscussaoService;
		
		@Autowired
		public TopicoDiscussaoController(TopicoDiscussaoService topicoDiscussaoService) {
			this.topicoDiscussaoService = topicoDiscussaoService;
		}
		
		@PostMapping
		public TopicoDiscussao createTopicoDiscussao(@RequestBody TopicoDiscussao topicoDiscussao) {
			return topicoDiscussaoService.saveTopicoDiscussao(topicoDiscussao);	}
		
		@GetMapping
		public List<TopicoDiscussao> getAllTopicoDiscussao(){
			return topicoDiscussaoService.getAllTopicoDiscussao();    
		}
		
		@GetMapping("/{id}")
		public TopicoDiscussao getTopicoDiscussao(@PathVariable Long id) {
			return topicoDiscussaoService.getTopicoDiscussaoById(id);
		}
		
		@DeleteMapping("/{id}")
		public void deleteTopicoDiscussao(@PathVariable Long id) {
			topicoDiscussaoService.deleteTopicoDiscussao(id);
		}
		
		
		@GetMapping("/topicoDiscussao/{id}")
		public List<TopicoDiscussao> listarTopicoDiscussaoPorForum(@RequestParam String tituloForum) {
			return topicoDiscussaoService.getTopicoDiscussaoByForum(tituloForum);	
			}
		
	}
