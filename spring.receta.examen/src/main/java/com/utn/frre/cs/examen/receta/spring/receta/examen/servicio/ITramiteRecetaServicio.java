package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteReceta;
@Repository
public interface ITramiteRecetaServicio {

	boolean addTramiteReceta(TramiteReceta tramiteReceta);
	
	TramiteReceta getTramiteReceta(long tramiteReceta_id);
	
	void updateTramiteReceta(TramiteReceta tramiteReceta);
	
	void deleteTramiteReceta(int tramiteReceta_id);
	
	List<TramiteReceta> getAllTramiteReceta();
	
}
