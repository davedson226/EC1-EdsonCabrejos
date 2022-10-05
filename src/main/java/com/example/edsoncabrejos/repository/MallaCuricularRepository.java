package com.example.edsoncabrejos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edsoncabrejos.model.MallaCuricular;

@Repository
public interface MallaCuricularRepository extends JpaRepository<MallaCuricular, Integer>{

}
