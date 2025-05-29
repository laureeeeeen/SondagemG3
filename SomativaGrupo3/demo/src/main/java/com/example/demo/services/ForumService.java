package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Forum;
import com.example.demo.repositories.ForumRepositorio;


@Service
public class ForumService {

	private final ForumRepositorio forumRepository;
	
	public ForumService(ForumRepositorio forumRepository) {
		
		this.forumRepository = forumRepository;
	}
	
	public Forum saveForum(Forum forum) {
		
		return forumRepository.save(forum);
	}
	
	public Forum getForumById(Long id) {
		return forumRepository.findById(id).orElse(null);
	}
	
	public List<Forum> getAllForum(){
		return forumRepository.findAll();
	}
	
	public void deleteForum(Long id) {
		forumRepository.deleteById(id);

	}
}
