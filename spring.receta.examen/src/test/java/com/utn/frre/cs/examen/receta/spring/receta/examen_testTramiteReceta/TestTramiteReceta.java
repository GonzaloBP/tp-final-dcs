package com.utn.frre.cs.examen.receta.spring.receta.examen_testTramiteReceta;

import java.util.Date;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.utn.frre.cs.examen.receta.spring.receta.examen.Application;
import com.utn.frre.cs.examen.receta.spring.receta.examen.entidad.TramiteReceta;
import com.utn.frre.cs.examen.receta.spring.receta.examen.servicio.TramiteRecetaServicio;




@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class TestTramiteReceta {

	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	
	
	// algunas pruebas simples para probar Junit y debug
	
	@Autowired
	 TramiteRecetaServicio  servicioTramite;
	
	
	
	@Test
	public void consultaPorId() {
		logger.info("\n buscar info solicitudExamen id 1 \n->{}",servicioTramite.getTramiteReceta(1001L));
		logger.info("\n buscar info solicitudExamen id 2 \n->{}",servicioTramite.getTramiteReceta(1002L));
		logger.info("\n buscar info solicitudExamen id 3 \n ->{}",servicioTramite.getTramiteReceta(1003L));
	}
	
	
	@Test
	public void testInsert() {
	TramiteReceta tr = new TramiteReceta(1050L, 302, 4, 301, new Date(), "cada 1 hora", 102, 202);
	 servicioTramite.addTramiteReceta(tr);
	}
		
	/*		
	@Test
	public void encontrarPorIdTest() {
		TramiteReceta tramiteReceta = em.find(TramiteReceta.class, 1001L);
		logger.info("info tramiteReceta findBy ID->", tramiteReceta.toString());
	}
	
	@Test
	public void inserReceta() {
		TramiteReceta tramiteReceta = em.find(TramiteReceta.class, 1001L);
		logger.info("info tramiteReceta findBy ID->", tramiteReceta.toString());
	}
	*/
	
}
