package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;


/**
 * Repositorio de Acceso a Datos para <code>CategoriaDatosExamen</code>.
 * 
 * @author Gonza
 * @version 1.0
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaDatosExamen;

@Repository
public interface CategoriaDatosExamenSpringDataRepositorio extends JpaRepository<CategoriaDatosExamen, Long> {

	// mis metodos particulares
	
}
