package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaExamen;


/**
 * Repositorio de Acceso a Datos para <code>CategoriaExamen</code>.
 * 
 * @author Gonza
 * @version 1.0
 */

@Repository
public interface CategoriaExamenSpringDataRepositorio extends JpaRepository<CategoriaExamen, Long> {

	// mis metodos particulares van aca

}
