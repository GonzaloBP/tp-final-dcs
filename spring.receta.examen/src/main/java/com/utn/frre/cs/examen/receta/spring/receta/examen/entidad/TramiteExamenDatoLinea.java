package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 
@Entity
public class TramiteExamenDatoLinea {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="IDE_TRAMITE_EXAMEN_DATO_LINEA")
	private Long ide_TramiteExamenDatoLinea;
	
	
	@ManyToOne 
	@JoinColumn(name="COD_DATO")
	private CategoriaDatosExamen categoriaDatoExamen;
	
	
	@ManyToOne
	@JoinColumn(name="IDE_SOLICITUD_EXAMEN")
	private TramiteExamen tramiteExamen;
	
	private String resultadoExamen;

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

	public TramiteExamenDatoLinea() {
		
	}

	public TramiteExamenDatoLinea(Long ide_TramiteExamenDatoLinea, CategoriaDatosExamen categoriaDatoExamen,
			TramiteExamen tramiteExamen, String resultadoExamen) {
		super();
		this.ide_TramiteExamenDatoLinea = ide_TramiteExamenDatoLinea;
		this.categoriaDatoExamen = categoriaDatoExamen;
		this.tramiteExamen = tramiteExamen;
		this.resultadoExamen = resultadoExamen;
	}

	public TramiteExamenDatoLinea(CategoriaDatosExamen categoriaDatoExamen, TramiteExamen tramiteExamen,
			String resultadoExamen) {
		super();
		this.categoriaDatoExamen = categoriaDatoExamen;
		this.tramiteExamen = tramiteExamen;
		this.resultadoExamen = resultadoExamen;
	}

	@Override
	public String toString() {
		return "TramiteExamenDatoLinea [ide_TramiteExamenDatoLinea=" + ide_TramiteExamenDatoLinea
				+ ", categoriaDatoExamen=" + categoriaDatoExamen + ", tramiteExamen=" + tramiteExamen
				+ ", resultadoExamen=" + resultadoExamen + "]";
	}
	
    
	
	
	
}
