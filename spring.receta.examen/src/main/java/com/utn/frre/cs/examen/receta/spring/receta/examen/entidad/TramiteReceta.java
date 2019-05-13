package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="encontrar_todas_TramiteRecetas", query="select t from TramiteReceta t")
public class TramiteReceta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="IDE_RECETA")
	private Long ide_receta;
	
	private int ide_personal_med;
	
	private int ide_presentacion_med;
	
	private int ide_med;
	
	private Date fecha_inicio_med;
	
	private String descripcionDosis;
	
	private int id_internacion;
	
	private int ide_expediente;
	
	
	public TramiteReceta() {
		
	}

	
	
	public TramiteReceta(int ide_personal_med, int ide_presentacion_med, int ide_med, Date fecha_inicio_med,
			String descripcionDosis, int id_internacion, int ide_expediente) {
		super();
		this.ide_personal_med = ide_personal_med;
		this.ide_presentacion_med = ide_presentacion_med;
		this.ide_med = ide_med;
		this.fecha_inicio_med = fecha_inicio_med;
		this.descripcionDosis = descripcionDosis;
		this.id_internacion = id_internacion;
		this.ide_expediente = ide_expediente;
	}

	
	public TramiteReceta(Long ide_receta, int ide_personal_med, int ide_presentacion_med, int ide_med,
			Date fecha_inicio_med, String descripcionDosis, int id_internacion, int ide_expediente) {
		super();
		this.ide_receta = ide_receta;
		this.ide_personal_med = ide_personal_med;
		this.ide_presentacion_med = ide_presentacion_med;
		this.ide_med = ide_med;
		this.fecha_inicio_med = fecha_inicio_med;
		this.descripcionDosis = descripcionDosis;
		this.id_internacion = id_internacion;
		this.ide_expediente = ide_expediente;
	}







	public Long getIde_receta() {
		return ide_receta;
	}


	public void setIde_receta(Long ide_receta) {
		this.ide_receta = ide_receta;
	}


	public int getIde_personal_med() {
		return ide_personal_med;
	}


	public void setIde_personal_med(int ide_personal_med) {
		this.ide_personal_med = ide_personal_med;
	}
  
	
	

	public int getIde_presentacion_med() {
		return ide_presentacion_med;
	}



	public void setIde_presentacion_med(int ide_presentacion_med) {
		this.ide_presentacion_med = ide_presentacion_med;
	}



	public int getIde_med() {
		return ide_med;
	}



	public void setIde_med(int ide_med) {
		this.ide_med = ide_med;
	}



	public Date getFecha_inicio_med() {
		return fecha_inicio_med;
	}


	public void setFecha_inicio_med(Date fecha_inicio_med) {
		this.fecha_inicio_med = fecha_inicio_med;
	}


	public String getDescripcionDosis() {
		return descripcionDosis;
	}


	public void setDescripcionDosis(String descripcionDosis) {
		this.descripcionDosis = descripcionDosis;
	}


	public int getId_internacion() {
		return id_internacion;
	}


	public void setId_internacion(int id_internacion) {
		this.id_internacion = id_internacion;
	}


	public int getIde_expediente() {
		return ide_expediente;
	}


	public void setIde_expediente(int ide_expediente) {
		this.ide_expediente = ide_expediente;
	}


	@Override
	public String toString() {
		return "\nTramiteReceta [ide_receta=" + ide_receta + ", ide_personal_med=" + ide_personal_med
				+ ", fecha_inicio_med=" + fecha_inicio_med + ", descripcionDosis=" + descripcionDosis
				+ ", id_internacion=" + id_internacion + ", ide_expediente=" + ide_expediente + "]";
	}
	
	
	
	
	
}
