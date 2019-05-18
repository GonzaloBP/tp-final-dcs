package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.AntecedenteInternacion;


/**
 * Repositorio de Acceso a Datos para <code>AntecedenteInternacion</code>.
 * 
 * @author Gonza
 * @version 1.0
 */
@Repository
public interface AntecedenteInternacionSpringDataRepositorio extends JpaRepository<AntecedenteInternacion, Long> {

	// mis metodos abstractos particulares
	
}
