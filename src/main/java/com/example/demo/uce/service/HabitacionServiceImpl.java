package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService {
	
	@Autowired
	private IHabitacionRepo habitacionRepo;
	@Autowired
	private IHotelService hotelService;
	
	@Override
	public void registrar(Habitacion habitacion, Integer idHotel) {
		
		// TODO Auto-generated method stub
		Hotel hotel2 = this.hotelService.buscar(idHotel);
		habitacion.setHotel(hotel2);
		this.habitacionRepo.insertar(habitacion);
	}

	@Override
	public void modificar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		this.habitacionRepo.actualizar(habitacion);
	}

	@Override
	public Habitacion mostrar(Integer id) {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.habitacionRepo.eliminar(id);
	}

}
