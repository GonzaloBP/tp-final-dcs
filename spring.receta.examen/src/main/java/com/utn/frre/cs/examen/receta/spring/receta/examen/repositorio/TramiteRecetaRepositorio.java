package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteReceta;



@Repository
@Transactional  
public class TramiteRecetaRepositorio {

	@PersistenceContext
	EntityManager gestorEntidad;
	
	public TramiteReceta encontrarPorId(int id) {
		 return  gestorEntidad.find(TramiteReceta.class , id); //JPA busqueda
	}
	
	public TramiteReceta actualizar(TramiteReceta TramiteReceta) {
		return gestorEntidad.merge(TramiteReceta); 
	}
	
	public TramiteReceta insertar(TramiteReceta TramiteReceta) {
		return gestorEntidad.merge(TramiteReceta);	}
	
	public void borrarPorId(int id) {
		TramiteReceta TramiteReceta = encontrarPorId(id);
		gestorEntidad.remove(TramiteReceta);
	}
	
	public List<TramiteReceta> encontrarTodo() {
		TypedQuery<TramiteReceta> namedQuery = gestorEntidad.createNamedQuery("encontrar_todas_TramiteRecetas", TramiteReceta.class);
		return	namedQuery.getResultList();	
	}
	
	
}
