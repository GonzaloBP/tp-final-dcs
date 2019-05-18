package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TipoAntecedente;

/**
 * Repositorio de Acceso a Datos para <code>TipoAntecedente</code>.
 * 
 * @author Gonza
 * @version 1.0
 */
@Repository
public interface TipoAntecedenteSpringDataRepositorio extends JpaRepository<TipoAntecedente, Long> {

	// mis metodos abstractos particulares
}
