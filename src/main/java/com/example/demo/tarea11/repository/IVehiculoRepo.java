package com.example.demo.tarea11.repository;

import com.example.demo.tarea11.modelo.Vehiculo;

public interface IVehiculoRepo {

	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(Integer id);
	public void eliminar(Integer id);
	
}
