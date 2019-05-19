package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Date;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table
public class Internacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HISTORIA_CLINICA")
	private long id_historiaclinica;
	
	private int id_internacion;
	
	private int id_expediente;
	
	private int id_personal;
	
	private Date fecha_ingreso;
	
	private String impresion_diagnostica;
	
	private String tratamiento;
	
	@OneToMany(mappedBy="internacion")
	private Set<TramiteReceta> tramiteReceta;
	
	@OneToMany(mappedBy="internacion")
	private Set<TramiteExamen> tramiteExamen;
	
	
	@OneToMany(mappedBy="internacion")
	private Set<AntecedenteInternacion> antecedenteInternacion;
	
	public Internacion() {
		
	}

	public Internacion(long id_historiaclinica, int id_internacion, int id_expediente, int id_personal,
			Date fecha_ingreso, String impresion_diagnostica, String tratamiento, Set<TramiteReceta> tramiteReceta,
			Set<TramiteExamen> tramiteExamen, Set<AntecedenteInternacion> antecedenteInternacion) {
		super();
		this.id_historiaclinica = id_historiaclinica;
		this.id_internacion = id_internacion;
		this.id_expediente = id_expediente;
		this.id_personal = id_personal;
		this.fecha_ingreso = fecha_ingreso;
		this.impresion_diagnostica = impresion_diagnostica;
		this.tratamiento = tratamiento;
		this.tramiteReceta = tramiteReceta;
		this.tramiteExamen = tramiteExamen;
		this.antecedenteInternacion = antecedenteInternacion;
	}

	public Internacion(int id_internacion, int id_expediente, int id_personal, Date fecha_ingreso,
			String impresion_diagnostica, String tratamiento, Set<TramiteReceta> tramiteReceta,
			Set<TramiteExamen> tramiteExamen, Set<AntecedenteInternacion> antecedenteInternacion) {
		super();
		this.id_internacion = id_internacion;
		this.id_expediente = id_expediente;
		this.id_personal = id_personal;
		this.fecha_ingreso = fecha_ingreso;
		this.impresion_diagnostica = impresion_diagnostica;
		this.tratamiento = tratamiento;
		this.tramiteReceta = tramiteReceta;
		this.tramiteExamen = tramiteExamen;
		this.antecedenteInternacion = antecedenteInternacion;
	}

	public long getId_historiaclinica() {
		return id_historiaclinica;
	}

	public void setId_historiaclinica(long id_historiaclinica) {
		this.id_historiaclinica = id_historiaclinica;
	}

	public int getId_internacion() {
		return id_internacion;
	}

	public void setId_internacion(int id_internacion) {
		this.id_internacion = id_internacion;
	}

	public int getId_expediente() {
		return id_expediente;
	}

	public void setId_expediente(int id_expediente) {
		this.id_expediente = id_expediente;
	}

	public int getId_personal() {
		return id_personal;
	}

	public void setId_personal(int id_personal) {
		this.id_personal = id_personal;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getImpresion_diagnostica() {
		return impresion_diagnostica;
	}

	public void setImpresion_diagnostica(String impresion_diagnostica) {
		this.impresion_diagnostica = impresion_diagnostica;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public Set<TramiteReceta> getTramiteReceta() {
		return tramiteReceta;
	}

	public void setTramiteReceta(Set<TramiteReceta> tramiteReceta) {
		this.tramiteReceta = tramiteReceta;
	}

	public Set<TramiteExamen> getTramiteExamen() {
		return tramiteExamen;
	}

	public void setTramiteExamen(Set<TramiteExamen> tramiteExamen) {
		this.tramiteExamen = tramiteExamen;
	}

	public Set<AntecedenteInternacion> getAntecedenteInternacion() {
		return antecedenteInternacion;
	}

	public void setAntecedenteInternacion(Set<AntecedenteInternacion> antecedenteInternacion) {
		this.antecedenteInternacion = antecedenteInternacion;
	}

	
	
	 
}
