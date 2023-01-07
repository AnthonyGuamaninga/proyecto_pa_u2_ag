package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Estudiante;

public interface IEstudianteRepository {
	
	public void insertar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	// CRUD siempre busca y elimina por PK (Primary Key)
	public Estudiante buscar (Integer id);
	public void eliminar (Integer id);

}
