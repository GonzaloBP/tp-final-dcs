package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.ElementoAntecedente;

/**
 * Repositorio de Acceso a Datos para <code>ElementoAntecedente</code>.
 * 
 * @author Gonza
 * @version 1.0
 */
@Repository
public interface ElementoAntecedenteSpringDataRepositorio extends JpaRepository<ElementoAntecedente, Long> {

	// mis metodos abstractos particulares
	
}
