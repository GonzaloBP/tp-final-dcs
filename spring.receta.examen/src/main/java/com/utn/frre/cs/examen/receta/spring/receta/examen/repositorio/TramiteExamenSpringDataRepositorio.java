package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamen;

public interface TramiteExamenSpringDataRepositorio extends JpaRepository<TramiteExamen, Long> {

}
