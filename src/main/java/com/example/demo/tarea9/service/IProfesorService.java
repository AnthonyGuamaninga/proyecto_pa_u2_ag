package com.example.demo.tarea9.service;

import com.example.demo.tarea9.modelo.Profesor;

public interface IProfesorService {

	public void ingresar(Profesor profesor);
	public void modificar(Profesor profesor);
	public Profesor encontrar(Integer id);
	public void eliminar(Integer id);
}
