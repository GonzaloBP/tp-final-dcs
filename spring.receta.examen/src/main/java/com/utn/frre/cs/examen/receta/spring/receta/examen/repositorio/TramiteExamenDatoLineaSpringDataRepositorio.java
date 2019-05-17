package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamenDatoLinea;

/**
 * Repositorio de Acceso a Datos para <code>TramiteExamenDatoLinea</code>.
 * 
 * @author Gonza
 * @version 1.0
 */

@Repository
public interface TramiteExamenDatoLineaSpringDataRepositorio extends JpaRepository<TramiteExamenDatoLinea, Long> {

	// mis metodos particulares

}
