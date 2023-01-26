package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tarea9.modelo.Estudiante;
import com.example.demo.tarea9.modelo.Facultad;
import com.example.demo.tarea9.service.IEstudianteService;
import com.example.demo.tarea9.service.IFacultadService;

@SpringBootApplication
public class TareasPaU2AgApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IFacultadService facultadService;
	
	public static void main(String[] args) {
		SpringApplication.run(TareasPaU2AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Insertar
		Facultad facultad = new Facultad();
		facultad.setNombre("Facultad de Ingeniería, Ciencias Físicas y Matemática");
		facultad.setUbicacion("Gilberto Gato y Gaspar de carvajal ");
		facultad.setUniversidad("UCE");
		
		List<Estudiante> listaE = new ArrayList<>();
		Estudiante estudiante = new Estudiante();
		estudiante.setCedula("173245883");
		estudiante.setNombre("Anthony");
		estudiante.setApellido("Guamaninga");
		estudiante.setFacultad(facultad);
		listaE.add(estudiante);
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setCedula("173245883");
		estudiante2.setNombre("Anthony");
		estudiante2.setApellido("Guamaninga");
		estudiante2.setFacultad(facultad);
		listaE.add(estudiante2);
		
		facultad.setListaEstu(listaE);
		this.facultadService.ingresar(facultad);
		
		// Buscar
		this.facultadService.buscar(1);
		
		// Actualizar
		Facultad facultadMod = this.facultadService.buscar(1);
		facultadMod.setNombre("Ingenieria y Ciencias Aplicadas");
		this.facultadService.modificar(facultadMod);
		
		// Eliminar
		this.facultadService.borrar(1);
	}

}
