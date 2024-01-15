package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context	= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		
		//Crud
		
		//Add
		Autor autor = new Autor(0,"nombre1","apellido1","pais1","direccion1","telefono1","correo1");
		//autorDAO.add(autor);
		
		//Up
		Autor autor2 = new Autor(50,"nombre1","apellido1","pais1","direccion1","telefono1","correo1");
		//autorDAO.up(autor2);
		
		//Del
		//autorDAO.del(54);
		
		
		//FinAll
		List<Autor> autores = autorDAO.finAll();
		
		
		
		for (Autor item : autores) {
			//System.out.println(item.toString());
		}
		
		//FinOne
		//Autor autor = autorDAO.FinOne(1);
			//System.out.println(autor.toString());
	
		//FinAll Busqueda
		List<Autor> autores2 = autorDAO.finAll("pam");
		for (Autor autor3 : autores2) {
			System.out.println(autor3.toString());
				
		}
		
		context.close();
		
	}

}
