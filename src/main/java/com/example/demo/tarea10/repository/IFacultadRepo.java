package com.example.demo.tarea10.repository;

import com.example.demo.tarea10.modelo.Facultad;

public interface IFacultadRepo {
	
	public void insertar(Facultad facultad);
	public void actualizar(Facultad facultad);
	public Facultad buscar(Integer id);
	public void eliminar(Integer id);

}
