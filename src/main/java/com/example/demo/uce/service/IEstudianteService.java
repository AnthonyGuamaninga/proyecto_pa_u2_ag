package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteService {
	
	public void registrar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void eliminar(Integer id);

}
