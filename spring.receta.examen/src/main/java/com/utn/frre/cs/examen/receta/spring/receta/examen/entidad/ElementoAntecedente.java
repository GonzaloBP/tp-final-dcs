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
@Table(name = "Elemento_Antecedente")
public class ElementoAntecedente {
	
	/**
	 * Es el id que identifica un  ElementoAntecedente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ELEMENTO_ANTECEDENTE")
	private Long id_elemento_antecendente;

	
	@ManyToOne
    @JoinColumn(name = "id_antecendete_internacion")
	AntecedenteInternacion antecedenteInternacion  ;
 
    @ManyToOne
    @JoinColumn(name = "id_tipo_antecendente")
    TipoAntecedente tipoAntecedente;
	
	
	/**
	 * Es la descripcion del elemento de Antecedente
	 */

	private String descripcionElementoAntecedente;
	
	/**
	 * Es la valoracion del elemento de Antecedente
	 */

	private String valoracionElementoAntecedente;
	
	/**
	 * Es la observacion del elemento de Antecedente
	 */

	private String observacionElementoAntecedente;
	
	public ElementoAntecedente(){
		
	}

	public ElementoAntecedente(Long id_elemento_antecendente, AntecedenteInternacion antecedenteInternacion,
			TipoAntecedente tipoAntecedente, String descripcionElementoAntecedente,
			String valoracionElementoAntecedente, String observacionElementoAntecedente) {
		super();
		this.id_elemento_antecendente = id_elemento_antecendente;
		this.antecedenteInternacion = antecedenteInternacion;
		this.tipoAntecedente = tipoAntecedente;
		this.descripcionElementoAntecedente = descripcionElementoAntecedente;
		this.valoracionElementoAntecedente = valoracionElementoAntecedente;
		this.observacionElementoAntecedente = observacionElementoAntecedente;
	}

	public ElementoAntecedente(AntecedenteInternacion antecedenteInternacion, TipoAntecedente tipoAntecedente,
			String descripcionElementoAntecedente, String valoracionElementoAntecedente,
			String observacionElementoAntecedente) {
		super();
		this.antecedenteInternacion = antecedenteInternacion;
		this.tipoAntecedente = tipoAntecedente;
		this.descripcionElementoAntecedente = descripcionElementoAntecedente;
		this.valoracionElementoAntecedente = valoracionElementoAntecedente;
		this.observacionElementoAntecedente = observacionElementoAntecedente;
	}

	public Long getId_elemento_antecendente() {
		return id_elemento_antecendente;
	}

	public void setId_elemento_antecendente(Long id_elemento_antecendente) {
		this.id_elemento_antecendente = id_elemento_antecendente;
	}

	public AntecedenteInternacion getAntecedenteInternacion() {
		return antecedenteInternacion;
	}

	public void setAntecedenteInternacion(AntecedenteInternacion antecedenteInternacion) {
		this.antecedenteInternacion = antecedenteInternacion;
	}

	public TipoAntecedente getTipoAntecedente() {
		return tipoAntecedente;
	}

	public void setTipoAntecedente(TipoAntecedente tipoAntecedente) {
		this.tipoAntecedente = tipoAntecedente;
	}

	public String getDescripcionElementoAntecedente() {
		return descripcionElementoAntecedente;
	}

	public void setDescripcionElementoAntecedente(String descripcionElementoAntecedente) {
		this.descripcionElementoAntecedente = descripcionElementoAntecedente;
	}

	public String getValoracionElementoAntecedente() {
		return valoracionElementoAntecedente;
	}

	public void setValoracionElementoAntecedente(String valoracionElementoAntecedente) {
		this.valoracionElementoAntecedente = valoracionElementoAntecedente;
	}

	public String getObservacionElementoAntecedente() {
		return observacionElementoAntecedente;
	}

	public void setObservacionElementoAntecedente(String observacionElementoAntecedente) {
		this.observacionElementoAntecedente = observacionElementoAntecedente;
	}

	@Override
	public String toString() {
		return "ElementoAntecedente [id_elemento_antecendente=" + id_elemento_antecendente + ", antecedenteInternacion="
				+ antecedenteInternacion + ", tipoAntecedente=" + tipoAntecedente + ", descripcionElementoAntecedente="
				+ descripcionElementoAntecedente + ", valoracionElementoAntecedente=" + valoracionElementoAntecedente
				+ ", observacionElementoAntecedente=" + observacionElementoAntecedente + "]";
	}
	
	
	
	
	
}
