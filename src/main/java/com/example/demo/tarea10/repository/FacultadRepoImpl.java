package com.example.demo.tarea10.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.tarea10.modelo.Facultad;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacultadRepoImpl implements IFacultadRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Facultad facultad) {
		// TODO Auto-generated method stub
		this.entityManager.persist(facultad);
	}

	@Override
	public void actualizar(Facultad facultad) {
		// TODO Auto-generated method stub
		this.entityManager.merge(facultad);
	}

	@Override
	public Facultad buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Facultad.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
