package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class TramiteExamen {

	@Id 
	@GeneratedValue
	@Column(name="IDE_SOLICITUD_EXAMEN")
	private Long ideSolicitudExamen;
	
	@OneToOne 
    private CategoriaExamen categoriaExamen;
    
	private int idePersonalMed;
	private Date fecExamen;
	private int idInternacion;
	private int ideExpediente;
	
	@OneToMany(mappedBy="tramiteExamen") 
	private List<TramiteExamenDatoLinea> tramiteExamenDatoLineas = new ArrayList<>();
	
	public TramiteExamen() {
		
	}
	
	
	public TramiteExamen(Long ideSolicitudExamen, CategoriaExamen categoriaExamen, int idePersonalMed, Date fecExamen,
			int idInternacion, int ideExpediente) {
		super();
		this.ideSolicitudExamen = ideSolicitudExamen;
		this.categoriaExamen = categoriaExamen;
		this.idePersonalMed = idePersonalMed;
		this.fecExamen = fecExamen;
		this.idInternacion = idInternacion;
		this.ideExpediente = ideExpediente;
	}


	public TramiteExamen(CategoriaExamen categoriaExamen, int idePersonalMed, Date fecExamen, int idInternacion,
			int ideExpediente) {
		super();
		this.categoriaExamen = categoriaExamen;
		this.idePersonalMed = idePersonalMed;
		this.fecExamen = fecExamen;
		this.idInternacion = idInternacion;
		this.ideExpediente = ideExpediente;
	}

	
	 
	 
	public List<TramiteExamenDatoLinea> getTramiteExamenDatoLineas() {
		return tramiteExamenDatoLineas;
	}


	public void addTramiteExamenDatoLineas( TramiteExamenDatoLinea  tramiteExamenDatoLineas) {
		this.tramiteExamenDatoLineas.add(tramiteExamenDatoLineas);
	}
	
	public void removeTramiteExamenDatoLineas( TramiteExamenDatoLinea  tramiteExamenDatoLineas) {
		this.tramiteExamenDatoLineas.remove(tramiteExamenDatoLineas);
	}
 

	public Long getIdeSolicitudExamen() {
		return ideSolicitudExamen;
	}


	public void setIdeSolicitudExamen(Long ideSolicitudExamen) {
		this.ideSolicitudExamen = ideSolicitudExamen;
	}


	public CategoriaExamen getCategoriaExamen() {
		return categoriaExamen;
	}


	public void setCategoriaExamen(CategoriaExamen categoriaExamen) {
		this.categoriaExamen = categoriaExamen;
	}


	public int getIdePersonalMed() {
		return idePersonalMed;
	}


	public void setIdePersonalMed(int idePersonalMed) {
		this.idePersonalMed = idePersonalMed;
	}


	public Date getFecExamen() {
		return fecExamen;
	}


	public void setFecExamen(Date fecExamen) {
		this.fecExamen = fecExamen;
	}


	public int getIdInternacion() {
		return idInternacion;
	}


	public void setIdInternacion(int idInternacion) {
		this.idInternacion = idInternacion;
	}


	public int getIdeExpediente() {
		return ideExpediente;
	}


	public void setIdeExpediente(int ideExpediente) {
		this.ideExpediente = ideExpediente;
	}


	@Override
	public String toString() {
		return "TramiteExamen [ideSolicitudExamen=" + ideSolicitudExamen + ", categoriaExamen=" + categoriaExamen
				+ ", idePersonalMed=" + idePersonalMed + ", fecExamen=" + fecExamen + ", idInternacion=" + idInternacion
				+ ", ideExpediente=" + ideExpediente + ", tramiteExamenDatoLineas=" + tramiteExamenDatoLineas + "]";
	}


	
	
	
	
	
}
