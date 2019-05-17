package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.List;




/**
 * Interface que define las operaciones basicas get,insert,delete,update para <code>TramiteReceta</code>.
 * 
 * @author Gonza
 * @version 1.0
 */
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
