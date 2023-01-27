package com.example.demo.tarea10.service;

import com.example.demo.tarea10.modelo.Profesor;

public interface IProfesorService {

	public void ingresar(Profesor profesor);
	public void modificar(Profesor profesor);
	public Profesor encontrar(Integer id);
	public void eliminar(Integer id);
	
}
