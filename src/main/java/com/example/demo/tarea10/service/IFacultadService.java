package com.example.demo.tarea10.service;

import com.example.demo.tarea10.modelo.Facultad;

public interface IFacultadService {
	
	public void ingresar(Facultad facultad);
	public void modificar(Facultad facultad);
	public Facultad buscar(Integer id);
	public void borrar(Integer id);

}
