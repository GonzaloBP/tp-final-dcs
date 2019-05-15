package com.utn.frre.cs.examen.receta.spring.receta.examen;

 

 
import java.util.Date;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaDatosExamen;
import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.CategoriaExamen;
import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteReceta;
import com.utn.frre.cs.examen.receta.spring.receta.examen.servicio.CategoriaDatosExamenServicio;
import com.utn.frre.cs.examen.receta.spring.receta.examen.servicio.CategoriaExamenServicio;
import com.utn.frre.cs.examen.receta.spring.receta.examen.servicio.TramiteRecetaServicio;


@SpringBootApplication
public class Application implements CommandLineRunner {

	 private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	

	 
	@Autowired
	TramiteRecetaServicio servicioTramite;
	
	@Autowired
	CategoriaExamenServicio servicioCategoriaExamen;
	
	@Autowired
	CategoriaDatosExamenServicio servicioCategoriaDatosExamen;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//      PRUEBAS DE DELETE,INSERT,UPDATE, ADD de TramiteRecetaServicio
		
		
		// get info de TramiteReceta la base de datos
		logger.info("\n buscar info de TramiteReceta en id 1 \n->{}",servicioTramite.getTramiteReceta(1001L));
		logger.info("\n buscar info de TramiteReceta id 2 \n->{}",servicioTramite.getTramiteReceta(1002L));
		logger.info("\n buscar info de TramiteReceta id 3 \n ->{}",servicioTramite.getTramiteReceta(1012L));
		
		//pk(id) de Tramite receta es autogenerado en insertion no es neceario ponerlo
		TramiteReceta nuevoTramiteReceta = new TramiteReceta( 301, 5, 302, new Date(), " cada 31   horas", 102, 201);
		logger.info("\n nueva insercion de TramiteReceta \n ->{}",servicioTramite.addTramiteReceta(nuevoTramiteReceta));
     		
		logger.info("\n recuperar toda la info de TramiteReceta   \n ->{}",servicioTramite.getAllTramiteReceta());	
		
		// BORRADO DE TRAMITE RECETA (debe haber algo que borrar)
		 //servicioTramite.deleteTramiteReceta(1018);
		 
		 //logger.info("\n ver resultado del borrado   \n ->{}",servicioTramite.getAllTramiteReceta());
		 
		 // ACTUALIZACION de tramite receta
		 TramiteReceta unTramiteReceta = servicioTramite.getTramiteReceta(1013L);
		 unTramiteReceta.setDescripcionDosis("TODO");
		 servicioTramite.updateTramiteReceta(unTramiteReceta);
		 
		 
		// Ver info recien actualizada de tramite receta
		 logger.info("\n buscar info de TramiteReceta en id 1 \n->{}",servicioTramite.getTramiteReceta(1015L));
		 
		 
		// get info de CategoriaExamen la base de datos
		 logger.info("\n buscar info de TramiteReceta en id 1 \n->{}", servicioCategoriaExamen.getAllCategoriaExamen());
		 
		//pk(id) de Tramite receta es autogenerado en insertion no es neceario ponerlo
		    CategoriaExamen nuevoCategoriaExamen = new CategoriaExamen( "Examen de audicion");
			logger.info("\n nueva insercion de categoria examen \n ->{}",servicioCategoriaExamen.addCategoriaExamen(nuevoCategoriaExamen));
	
			// get info de CategoriaExamen la base de datos
			 logger.info("\n buscar toda info de categoria examen en id 1 \n->{}", servicioCategoriaExamen.getAllCategoriaExamen());
			 
			 
			// get info de CategoriaExamen la base de datos
			 logger.info("\n buscar info de CategoriaDatosExamen en id 50 \n->{}", servicioCategoriaDatosExamen.getCategoriaDatosExamen(51));
			
			CategoriaExamen ce = servicioCategoriaExamen.getCategoriaExamen(100);
			 //pk(id) de CategoriaDatosExamen es autogenerado en insertion no es neceario ponerlo
			 CategoriaDatosExamen nuevoCategoriaDatosExamen = new CategoriaDatosExamen(ce, "analisis de anemia leve" );
				logger.info("\n nueva insercion de categoriaDatoExamen \n ->{}",servicioCategoriaDatosExamen.addCategoriaDatosExamen(nuevoCategoriaDatosExamen));
				logger.info("\n buscar info de CategoriaDatosExamen  \n->{}", servicioCategoriaDatosExamen.getAllCategoriaDatosExamen());
	}

}
