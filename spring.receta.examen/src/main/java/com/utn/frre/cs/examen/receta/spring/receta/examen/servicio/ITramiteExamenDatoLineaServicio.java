package com.utn.frre.cs.examen.receta.spring.receta.examen.servicio;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteExamenDatoLinea;

/**
 * Interface que define las operaciones basicas get,insert,delete,update para
 * <code>TramiteExamenDatoLinea</code>.
 * 
 * @author Gonza
 * @version 1.0
 */
@Repository
public interface ITramiteExamenDatoLineaServicio {

	boolean addTramiteExamenDatoLinea(TramiteExamenDatoLinea tramiteExamenDatoLinea);

	TramiteExamenDatoLinea getTramiteExamenDatoLinea(long tramiteExamenDatoLinea_id);

	void updateTramiteExamenDatoLinea(TramiteExamenDatoLinea tramiteExamenDatoLinea);

	void deleteTramiteExamenDatoLinea(int tramiteExamenDatoLinea_id);

	List<TramiteExamenDatoLinea> getAllTramiteExamenDatoLinea();

}
