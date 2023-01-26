package com.example.demo.tarea9.service;

import com.example.demo.tarea9.modelo.Estudiante;

public interface IEstudianteService {
	
	public void registrar(Estudiante estudiante);
	public void modificar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void borrar(Integer id);

}
