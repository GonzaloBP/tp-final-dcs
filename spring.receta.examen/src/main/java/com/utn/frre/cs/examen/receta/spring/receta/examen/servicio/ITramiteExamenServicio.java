package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamen;

/**
 * Interface que define las operaciones basicas get,insert,delete,update para
 * <code>TramiteExamen</code>.
 * 
 * @author Gonza
 * @version 1.0
 */
@Repository
public interface ITramiteExamenServicio {

	boolean addTramiteExamen(TramiteExamen tramiteExamen);

	TramiteExamen getTramiteExamen(long tramiteExamen_id);

	void updateTramiteExamen(TramiteExamen tramiteExamen);

	void deleteTramiteExamen(int tramiteExamen_id);

	List<TramiteExamen> getAllTramiteExamen();

}
