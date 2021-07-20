package com.tutoria.onetoone02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutoria.onetoone02.entity.Ciudadano;
import com.tutoria.onetoone02.entity.Vacuna;
import com.tutoria.onetoone02.repository.CiudadanoRepository;
import com.tutoria.onetoone02.repository.VacunaRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	CiudadanoRepository ciudadanoRepository;
	
	@Autowired
	VacunaRepository vacunaRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Ciudadano pepe = new Ciudadano ("pepe"); Ciudadano juan = new Ciudadano
		 * ("juan");
		 * 
		 * Vacuna vacuna1 = new Vacuna("pf"); Vacuna vacuna2 = new Vacuna("mod");
		 * 
		 * pepe.setVacuna(vacuna1); juan.setVacuna(vacuna2);
		 * 
		 * ciudadanoRepository.save(pepe); ciudadanoRepository.save(juan);
		 */
		
		Ciudadano pepe = ciudadanoRepository.findById(2).get();
		pepe.deleteVacuna();
		ciudadanoRepository.save(pepe);
	}

}
