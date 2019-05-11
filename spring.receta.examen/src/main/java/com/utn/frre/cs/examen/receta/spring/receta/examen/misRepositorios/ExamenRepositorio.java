package com.utn.frre.cs.examen.receta.spring.receta.examen.misRepositorios;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.Examen;

@Repository 
@Transactional
public class ExamenRepositorio {

	@PersistenceContext
	EntityManager gestorEntidad;
	
	public Examen encontrarPorId(int id) {
		 return  gestorEntidad.find(Examen.class , id); //JPA busqueda
	}
	
	public Examen actualizarExamen(Examen examen) {
		return gestorEntidad.merge(examen); 
	}
	
	public Examen insertarExamen(Examen examen) {
		return gestorEntidad.merge(examen); 
	}
	
	public void borrarExamenPorId(int id) {
		Examen examen = encontrarPorId(id);
		gestorEntidad.remove(examen);
	}
	
	public List<Examen> encontrarTodosExamenes() {
		TypedQuery<Examen> namedQuery = gestorEntidad.createNamedQuery("Listar_todos_examenes", Examen.class);
		return	namedQuery.getResultList();	
	}
	
	public List<Examen> encontrarInternacionesPaciente() {
		TypedQuery<Examen> namedsQuery = gestorEntidad.createNamedQuery("Listar_internaciones_pacientes", Examen.class);
		return	namedsQuery.getResultList();	
	}
	
}
