package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamen;

/**
 * Repositorio de Acceso a Datos para <code>TramiteExamen</code>.
 * 
 * @author Gonza
 * @version 1.0
 */
@Repository
public interface TramiteExamenSpringDataRepositorio extends JpaRepository<TramiteExamen, Long> {

	// mis metodos particulares
	
}
