package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.TopicoDiscussao;

public interface TopicoDiscussaoRepositorio extends JpaRepository<TopicoDiscussao, Long>{

    @Query("SELECT t FROM TopicoDiscussao t WHERE t.forum.tituloForum = :tituloForum")  
    List<TopicoDiscussao> findTopicoDiscussaoByForum(@Param("tituloForum") String tituloForum);
}
