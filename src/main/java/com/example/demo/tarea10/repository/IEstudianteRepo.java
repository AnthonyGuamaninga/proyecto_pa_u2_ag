package com.example.demo.tarea10.repository;

import com.example.demo.tarea10.modelo.Estudiante;

public interface IEstudianteRepo {
	
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void eliminar(Integer id);

}
