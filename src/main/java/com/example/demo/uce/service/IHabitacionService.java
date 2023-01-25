package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionService {
	
	public void registrar(Habitacion habitacion, Integer idHotel);
	public void modificar(Habitacion habitacion);
	public Habitacion mostrar(Integer id);
	public void eliminar(Integer id);

}
