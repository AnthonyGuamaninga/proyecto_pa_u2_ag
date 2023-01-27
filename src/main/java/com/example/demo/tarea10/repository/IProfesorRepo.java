package com.example.demo.tarea10.repository;

import com.example.demo.tarea10.modelo.Profesor;

public interface IProfesorRepo {

	public void insertar(Profesor profesor);
	public void actualizar(Profesor profesor);
	public Profesor buscar(Integer id);
	public void eliminar(Integer id);
	
}
