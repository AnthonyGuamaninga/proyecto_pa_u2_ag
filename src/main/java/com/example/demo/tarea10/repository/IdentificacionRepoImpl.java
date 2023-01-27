package com.example.demo.tarea10.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.tarea10.modelo.Identificacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class IdentificacionRepoImpl implements IIdentificacionRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Identificacion identificacion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(identificacion);
	}

	@Override
	public void actualizar(Identificacion identificacion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(identificacion);
	}

	@Override
	public Identificacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Identificacion.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
