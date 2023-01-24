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
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.IEmpleadoRepo;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2Ag1Application implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IEmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Ag1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*		
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setNombre("Alfred");
		ciudadano.setApellido("Yaguavhe");
		
		Empleado empleado = new Empleado();
		empleado.setSalario(new BigDecimal(20));
		empleado.setFechaIngreso(LocalDateTime.now());
		empleado.setCiudadano(ciudadano);
		
		ciudadano.setEmpleado(empleado);
		
		this.ciudadanoService.guardar(ciudadano);
		
		//Segundo ejemplo:
		Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setApellido("Gonzales");
		ciudadano2.setNombre("Samir");
		
		Empleado empleado2 = new Empleado();
		empleado2.setFechaIngreso(LocalDateTime.now());
		empleado2.setSalario(new BigDecimal(200));
		empleado2.setCiudadano(ciudadano2);
		
		ciudadano2.setEmpleado(empleado2);
		
		this.empleadoService.ingresar(empleado2);
		*/
		
		Hotel hotel = new Hotel();
		
		
		Habitacion habitacion = new Habitacion();
		
		
	}

}
