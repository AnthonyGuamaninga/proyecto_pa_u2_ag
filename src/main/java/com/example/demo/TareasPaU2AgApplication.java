package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.dialect.InnoDBStorageEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tarea10.modelo.Identificacion;
import com.example.demo.tarea10.modelo.Profesor;
import com.example.demo.tarea10.service.IProfesorService;

@SpringBootApplication
public class TareasPaU2AgApplication implements CommandLineRunner{

	@Autowired
	private IProfesorService iProfesorService;
	
	public static void main(String[] args) {
		SpringApplication.run(TareasPaU2AgApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Insertar
		Profesor profesor = new Profesor();
		profesor.setTitulo("Licenciado en Gastronomía");
		profesor.setSalario(new BigDecimal(2000));
		
		Identificacion identificacion = new Identificacion();
		identificacion.setNombre("Steven");
		identificacion.setApellido("Yaguache");
		identificacion.setNacionalidad("Ecuatoriano");
		identificacion.setCedula("1323455674");
		identificacion.setFechaNacimiento(LocalDateTime.of(2000, 03,03,12,01));
		identificacion.setProfesor(profesor);
		
		profesor.setIdentificacion(identificacion);
		this.iProfesorService.ingresar(profesor);
		
		// Buscar
		this.iProfesorService.encontrar(1);
		
		// Actualizar
		Profesor profesorMod = this.iProfesorService.encontrar(1);
		profesorMod.setSalario(new BigDecimal(3500));
		profesorMod.setTitulo("Licenciado en Turismo");
		this.iProfesorService.modificar(profesorMod);
		
		// Eliminar
		this.iProfesorService.eliminar(1);
	}

}
