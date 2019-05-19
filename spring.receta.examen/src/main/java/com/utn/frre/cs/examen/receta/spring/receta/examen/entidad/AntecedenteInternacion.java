package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "Antecedente_Internacion")
public class AntecedenteInternacion {

	/**
	 * Es el id que identifica un  Antecedente de Internacion
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ANTECEDENTE_INTERNACION")
	private Long id_antecendete_internacion;

	@ManyToOne
	@JoinColumn(name="id_tipo_antecendente", nullable=false)
	private TipoAntecedente tipoAntecedente;
	
	@ManyToOne
	@JoinColumn(name="id_historiaclinica", nullable=false)
	private Internacion internacion;
	
	/**
	 * Es la descripcion del  Antecedente
	 */
	private String observacion;
	
	/**
	 * Es la valoracion del  Antecedente 
	 */
	private String valoracion;

	
	public AntecedenteInternacion() {
		
	}


	
	
	public AntecedenteInternacion(Long id_antecendete_internacion, TipoAntecedente tipoAntecedente,
			Internacion internacion, String observacion, String valoracion) {
		super();
		this.id_antecendete_internacion = id_antecendete_internacion;
		this.tipoAntecedente = tipoAntecedente;
		this.internacion = internacion;
		this.observacion = observacion;
		this.valoracion = valoracion;
	}


	
	public AntecedenteInternacion(TipoAntecedente tipoAntecedente, Internacion internacion, String observacion,
			String valoracion) {
		super();
		this.tipoAntecedente = tipoAntecedente;
		this.internacion = internacion;
		this.observacion = observacion;
		this.valoracion = valoracion;
	}




	public Long getId_antecendete_internacion() {
		return id_antecendete_internacion;
	}


	public void setId_antecendete_internacion(Long id_antecendete_internacion) {
		this.id_antecendete_internacion = id_antecendete_internacion;
	}


	public TipoAntecedente getTipoAntecedente() {
		return tipoAntecedente;
	}


	public void setTipoAntecedente(TipoAntecedente tipoAntecedente) {
		this.tipoAntecedente = tipoAntecedente;
	}


	public Internacion getInternacion() {
		return internacion;
	}


	public void setInternacion(Internacion internacion) {
		this.internacion = internacion;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public String getValoracion() {
		return valoracion;
	}


	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}




	@Override
	public String toString() {
		return "AntecedenteInternacion [id_antecendete_internacion=" + id_antecendete_internacion + ", tipoAntecedente="
				+ tipoAntecedente + ", internacion=" + internacion + ", observacion=" + observacion + ", valoracion="
				+ valoracion + "]";
	}
	
	
	
	
	
}
