package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Forum;
import com.example.demo.services.ForumService;

@RestController
@RequestMapping("/forum")
public class ForumController {
	
	private final ForumService forumService;
	
	@Autowired

	public ForumController(ForumService forumService) {
		this.forumService = forumService;
	}
	
	@PostMapping
	public Forum createTopicoDiscussao(@RequestBody Forum forum) {
		return forumService.saveForum(forum);	}
	
	@GetMapping
	public List<Forum> getAllForum(){
		return forumService.getAllForum();    
	}
	
	@GetMapping("/{id}")
	public Forum getForum(@PathVariable Long id) {
		return forumService.getForumById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteForum(@PathVariable Long id) {
		forumService.deleteForum(id);
	}

}
