package com.example.edsoncabrejos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edsoncabrejos.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
