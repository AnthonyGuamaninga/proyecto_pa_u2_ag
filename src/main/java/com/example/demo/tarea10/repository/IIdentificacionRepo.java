package com.example.demo.tarea10.repository;

import com.example.demo.tarea10.modelo.Identificacion;

public interface IIdentificacionRepo {
	
	public void insertar(Identificacion identificacion);
	public void actualizar(Identificacion identificacion);
	public Identificacion buscar(Integer id);
	public void eliminar(Integer id);

}
