package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;
import com.example.demo.uce.service.ILibroService;

@SpringBootApplication
public class ProyectoPaU2Ag1Application implements CommandLineRunner{

	@Autowired
	private ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2Ag1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// INSERTAR LIBRO
		
		Libro libro = new Libro();
		libro.setNombre("Análisis N");
		libro.setEditorial("LEE");
		
		Autor autor = new Autor();
		autor.setNombre("O");
		Autor autor2 = new Autor();
		autor2.setNombre("D");
		Autor autor3= new Autor();
		autor3.setNombre("J");
		
		
		Set<Autor> autores = new HashSet<>();
		autores.add(autor);
		autores.add(autor2);
		autores.add(autor3);
		
		libro.setAutores(autores);
		this.iLibroService.crear(libro);
		
		
		
		
	}

}
