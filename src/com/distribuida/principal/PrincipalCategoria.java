package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		
		// Add
		Categoria categoria = new Categoria(0, "categoria", "descripcion");
		categoriaDAO.add(categoria);

		// Update
		Categoria categoria2 = new Categoria(54, "categoria", "descripcion");
		//categoriaDAO.update(categoria2);

		// Delete
		// categoriaDAO.delete(54);

		// FindAll
		List<Categoria> categorias = categoriaDAO.findAll();

		for (Categoria item : categorias) {
			//System.out.println(item.toString());
		}

		// FindOne
		// Categoria categoria = categoriaDAO.findOne(1);
		// System.out.println(categoria.toString());

		// FindAll Busqueda
		// List<Categoria> categorias2 = categoriaDAO.findAll("pam");
		// for (Categoria categoria3 : categorias2) {
		// System.out.println(categoria3.toString());

		context.close();
	}
}
