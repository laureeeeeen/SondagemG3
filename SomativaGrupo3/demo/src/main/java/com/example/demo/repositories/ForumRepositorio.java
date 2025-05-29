package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Forum;

public interface ForumRepositorio extends JpaRepository<Forum, Long>{

}
