package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteReceta;

/**
 * Repositorio de Acceso a Datos para <code>TramiteReceta</code>.
 * 
 * @author Gonza
 * @version 1.0
 */

@Repository
public interface TramiteRecetaSpringDataRepositorio extends JpaRepository<TramiteReceta, Long> {

	// mis metodos particulares

}
