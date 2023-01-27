package com.example.demo.tarea9.service;

import com.example.demo.tarea9.modelo.Identificacion;

public interface IIdentificacionService {

	public void registrar(Identificacion identificacion);
	public void modificar(Identificacion identificacion);
	public Identificacion buscar(Integer id);
	public void eliminar(Integer id);
}
