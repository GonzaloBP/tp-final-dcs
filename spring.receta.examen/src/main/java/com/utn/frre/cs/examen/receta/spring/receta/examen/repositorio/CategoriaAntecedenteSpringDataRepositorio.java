package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaAntecedente;

/**
 * Repositorio de Acceso a Datos para <code>CategoriaAntecedente</code>.
 * 
 * @author Gonza
 * @version 1.0
 */
@Repository
public interface CategoriaAntecedenteSpringDataRepositorio extends JpaRepository<CategoriaAntecedente, Long>{

	// mis metodos abstractos particulares
	
}
