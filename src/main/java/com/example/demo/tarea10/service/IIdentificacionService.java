package com.example.demo.tarea10.service;

import com.example.demo.tarea10.modelo.Identificacion;

public interface IIdentificacionService {

	public void registrar(Identificacion identificacion);
	public void modificar(Identificacion identificacion);
	public Identificacion buscar(Integer id);
	public void eliminar(Integer id);
	
}
