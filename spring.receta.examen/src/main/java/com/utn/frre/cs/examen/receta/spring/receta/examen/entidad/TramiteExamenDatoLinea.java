package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TramiteExamenDatoLinea: Representa el tramite de un estudio particular
 * solicitado y el resultado del mismo
 * 
 * @author Gonza
 * @version 1.0
 */

@Entity
@Table(name = "Tramite_Examen_estudio_solicitado")
public class TramiteExamenDatoLinea {

	/**
	 * Es el id del tramite de un estudio particular solicitado
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDE_TRAMITE_EXAMEN_DATO_LINEA")
	private Long ide_TramiteExamenDatoLinea;

	/**
	 * Representa un estudio particular sobre un determinado tipo/Categoria de
	 * Examen
	 */

	@ManyToOne
	@JoinColumn(name = "cod_dato")
	private CategoriaDatosExamen categoriaDatoExamen;

	/**
	 * Representa un TramiteExamen al que pertenece este estudio en particular.
	 */

	@ManyToOne
	@JoinColumn(name = "ideSolicitudExamen")
	private TramiteExamen tramiteExamen;

	/**
	 * Representa el resultado del estudio solicitado.
	 */

	private String resultadoExamen;
	
	
	private String estadoEstudio;

	
	private Date fechaEstudio;

	public TramiteExamenDatoLinea() {
		
	}

	public TramiteExamenDatoLinea(Long ide_TramiteExamenDatoLinea, CategoriaDatosExamen categoriaDatoExamen,
			TramiteExamen tramiteExamen, String resultadoExamen, String estadoEstudio, Date fechaEstudio) {
		super();
		this.ide_TramiteExamenDatoLinea = ide_TramiteExamenDatoLinea;
		this.categoriaDatoExamen = categoriaDatoExamen;
		this.tramiteExamen = tramiteExamen;
		this.resultadoExamen = resultadoExamen;
		this.estadoEstudio = estadoEstudio;
		this.fechaEstudio = fechaEstudio;
	}


	public TramiteExamenDatoLinea(CategoriaDatosExamen categoriaDatoExamen, TramiteExamen tramiteExamen,
			String resultadoExamen, String estadoEstudio, Date fechaEstudio) {
		super();
		this.categoriaDatoExamen = categoriaDatoExamen;
		this.tramiteExamen = tramiteExamen;
		this.resultadoExamen = resultadoExamen;
		this.estadoEstudio = estadoEstudio;
		this.fechaEstudio = fechaEstudio;
	}

	// Getters y Setters
	
	public Long getIde_TramiteExamenDatoLinea() {
		return ide_TramiteExamenDatoLinea;
	}

	public void setIde_TramiteExamenDatoLinea(Long ide_TramiteExamenDatoLinea) {
		this.ide_TramiteExamenDatoLinea = ide_TramiteExamenDatoLinea;
	}

	public CategoriaDatosExamen getCategoriaDatoExamen() {
		return categoriaDatoExamen;
	}

	public void setCategoriaDatoExamen(CategoriaDatosExamen categoriaDatoExamen) {
		this.categoriaDatoExamen = categoriaDatoExamen;
	}

	public TramiteExamen getTramiteExamen() {
		return tramiteExamen;
	}

	public void setTramiteExamen(TramiteExamen tramiteExamen) {
		this.tramiteExamen = tramiteExamen;
	}

	public String getResultadoExamen() {
		return resultadoExamen;
	}

	public void setResultadoExamen(String resultadoExamen) {
		this.resultadoExamen = resultadoExamen;
	}

	public String getEstadoEstudio() {
		return estadoEstudio;
	}

	public void setEstadoEstudio(String estadoEstudio) {
		this.estadoEstudio = estadoEstudio;
	}

	public Date getFechaEstudio() {
		return fechaEstudio;
	}

	public void setFechaEstudio(Date fechaEstudio) {
		this.fechaEstudio = fechaEstudio;
	}

	@Override
	public String toString() {
		return "TramiteExamenDatoLinea [ide_TramiteExamenDatoLinea=" + ide_TramiteExamenDatoLinea
				+ ", categoriaDatoExamen=" + categoriaDatoExamen + ", tramiteExamen=" + tramiteExamen
				+ ", resultadoExamen=" + resultadoExamen + ", estadoEstudio=" + estadoEstudio + ", fechaEstudio="
				+ fechaEstudio + "]";
	}

	
	

	

	
	
	
}
