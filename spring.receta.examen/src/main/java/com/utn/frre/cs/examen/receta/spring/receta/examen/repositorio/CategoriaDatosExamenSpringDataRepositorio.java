package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaDatosExamen;


public interface CategoriaDatosExamenSpringDataRepositorio extends JpaRepository<CategoriaDatosExamen, Long> {

}
