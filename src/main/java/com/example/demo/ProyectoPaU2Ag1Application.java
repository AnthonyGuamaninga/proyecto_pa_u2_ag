package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2Ag1Application implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Ag1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// INSERTAR
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Torres");
		estudiante.setCedula("1133611347");
		estudiante.setCiudad("Loja");
		estudiante.setGenero("Femanino");
		estudiante.setNombre("Sandra");		
		this.estudianteService.registrar(estudiante);
		
		// ACTUALIZAR
		Estudiante estudiante2 = this.estudianteService.buscar(2);
		estudiante2.setCiudad("Cuenca");
		this.estudianteService.actualizar(estudiante2);
		
		// BUSCAR	
		this.estudianteService.buscar(3);
		
		
		// ELIMINAR
		//this.estudianteService.eliminar(4);
		
	}

}
