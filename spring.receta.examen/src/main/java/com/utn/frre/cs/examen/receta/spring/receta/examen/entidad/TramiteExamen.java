package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TramiteExamen: Representa el tramite que un medico hace de una Categoria
 * particular de examen para un paciente en particular en una internacion
 * 
 * @author Gonza
 * @version 1.0
 */
@Entity
@Table(name = "Tramite_Examen")
public class TramiteExamen {

	/**
	 * Es el id que identifica un Tramite de examen que inicio un medico de una
	 * Categoria particular de examen
	 */

	@Id
	@GeneratedValue
	@Column(name = "IDE_SOLICITUD_EXAMEN")
	private Long ideSolicitudExamen;


	/**
	 * Representa el id que identifica al medico que inicio este tramite
	 */
	private int idePersonalMed;

	/**
	 * Representa la fecha en que se solicito este examen
	 */
	private Date fecExamen;

	
	/**
	 * Es la historia clinica donde se registrara este tramite de receta
	 */
	@ManyToOne
	@JoinColumn(name="id_historiaclinica",nullable=false)
	private Internacion internacion;
	/**
	 * Representa que un tramite puede tener multiples estudios solicitados 
	 * 
	 */

	@OneToMany(mappedBy = "tramiteExamen")
	private Set<TramiteExamenDatoLinea> tramiteExamenDatoLineas;

	/**
	 * Constructor por defecto de la clase TramiteExamen
	 */

	public TramiteExamen() {

	}

	public TramiteExamen(Long ideSolicitudExamen, CategoriaExamen categoriaExamen, int idePersonalMed, Date fecExamen,
			Internacion internacion, Set<TramiteExamenDatoLinea> tramiteExamenDatoLineas) {
		super();
		this.ideSolicitudExamen = ideSolicitudExamen;
		this.idePersonalMed = idePersonalMed;
		this.fecExamen = fecExamen;
		this.internacion = internacion;
		this.tramiteExamenDatoLineas = tramiteExamenDatoLineas;
	}

	public TramiteExamen(CategoriaExamen categoriaExamen, int idePersonalMed, Date fecExamen, Internacion internacion,
			Set<TramiteExamenDatoLinea> tramiteExamenDatoLineas) {
		super();
		this.idePersonalMed = idePersonalMed;
		this.fecExamen = fecExamen;
		this.internacion = internacion;
		this.tramiteExamenDatoLineas = tramiteExamenDatoLineas;
	}

	//Getters y Setters-----------------------------------------
	
	
	public Long getIdeSolicitudExamen() {
		return ideSolicitudExamen;
	}

	public void setIdeSolicitudExamen(Long ideSolicitudExamen) {
		this.ideSolicitudExamen = ideSolicitudExamen;
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

	public Internacion getInternacion() {
		return internacion;
	}

	public void setInternacion(Internacion internacion) {
		this.internacion = internacion;
	}

	public Set<TramiteExamenDatoLinea> getTramiteExamenDatoLineas() {
		return tramiteExamenDatoLineas;
	}

	public void setTramiteExamenDatoLineas(Set<TramiteExamenDatoLinea> tramiteExamenDatoLineas) {
		this.tramiteExamenDatoLineas = tramiteExamenDatoLineas;
	}

	@Override
	public String toString() {
		return "TramiteExamen [ideSolicitudExamen=" + ideSolicitudExamen + ", categoriaExamen=" 
				+ ", idePersonalMed=" + idePersonalMed + ", fecExamen=" + fecExamen + ", internacion=" + internacion
				+ "]";
	}

	

}
