package com.example.edsoncabrejos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edsoncabrejos.model.Universidad;
@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer>{

}
