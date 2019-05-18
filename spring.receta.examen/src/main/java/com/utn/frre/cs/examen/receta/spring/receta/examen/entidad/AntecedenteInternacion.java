package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Antecedente_Internacion")
public class AntecedenteInternacion {

	/**
	 * Es el id que identifica un  TipoAntecedente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ANTECEDENTE_INTERNACION")
	private Long id_antecendete_internacion;

	@ManyToOne
	@JoinColumn(name="id_historiaclinica", nullable=false)
	private Internacion internacion;
	
	@OneToMany(mappedBy="antecedenteInternacion")
	 private Set<ElementoAntecedente> elementoAntecedente;

	public AntecedenteInternacion() {
		
	}
	
	
	public AntecedenteInternacion(Long id_antecendete_internacion, Internacion internacion,
			Set<ElementoAntecedente> elementoAntecedente) {
		super();
		this.id_antecendete_internacion = id_antecendete_internacion;
		this.internacion = internacion;
		this.elementoAntecedente = elementoAntecedente;
	}

	public AntecedenteInternacion(Internacion internacion, Set<ElementoAntecedente> elementoAntecedente) {
		super();
		this.internacion = internacion;
		this.elementoAntecedente = elementoAntecedente;
	}


	public Long getId_antecendete_internacion() {
		return id_antecendete_internacion;
	}


	public void setId_antecendete_internacion(Long id_antecendete_internacion) {
		this.id_antecendete_internacion = id_antecendete_internacion;
	}


	public Internacion getInternacion() {
		return internacion;
	}


	public void setInternacion(Internacion internacion) {
		this.internacion = internacion;
	}


	public Set<ElementoAntecedente> getElementoAntecedente() {
		return elementoAntecedente;
	}


	public void setElementoAntecedente(Set<ElementoAntecedente> elementoAntecedente) {
		this.elementoAntecedente = elementoAntecedente;
	}

    // ojo con las listas/set en toString
	@Override
	public String toString() {
		return "AntecedenteInternacion [id_antecendete_internacion=" + id_antecendete_internacion + ", internacion="
				+ internacion + ", elementoAntecedente=" + elementoAntecedente + "]";
	}
	
	
	
}
