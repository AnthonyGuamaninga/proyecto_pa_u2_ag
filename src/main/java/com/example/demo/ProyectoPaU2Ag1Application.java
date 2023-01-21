package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
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
		
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setNombre("Alfred");
		ciudadano.setApellido("Yaguavhe");
		
		Empleado empleado = new Empleado();
		empleado.setSalario(new BigDecimal(20));
		empleado.setFechaIngreso(LocalDateTime.now());
		empleado.setCiudadano(ciudadano);
		
		ciudadano.setEmpleado(empleado);
		
	}

}
