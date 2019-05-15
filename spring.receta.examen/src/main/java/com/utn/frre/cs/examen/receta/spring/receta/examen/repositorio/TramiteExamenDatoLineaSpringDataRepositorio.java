package com.utn.frre.cs.examen.receta.spring.receta.examen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamenDatoLinea;

@Repository
public interface TramiteExamenDatoLineaSpringDataRepositorio extends JpaRepository<TramiteExamenDatoLinea, Long> {

}
