package com.tutoria.onetoone02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutoria.onetoone02.entity.Vacuna;

@Repository
public interface VacunaRepository extends JpaRepository<Vacuna, Integer>{

}
