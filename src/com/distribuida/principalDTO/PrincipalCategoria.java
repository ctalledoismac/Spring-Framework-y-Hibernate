package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dto.CategoriaService;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaService categoriaService = context.getBean("categoriaServiceImpl", CategoriaService.class);
		
		// Add
		//categoriaService.add(0, "categoria", "descripcion");

		// Update
		//categoriaService.update(58, "categoria66", "descripcion66");

		// Delete
		//categoriaService.delete(58);

		// FindAll
		//List<Categoria> categorias = categoriaService.findAll();
		//for (Categoria item : categorias) {
			//System.out.println(item.toString());
		//}

		// FindOne
		//Categoria categoria = categoriaService.findOne(1);
		//System.out.println(categoria.toString());

		// FindAll Busqueda
		//List<Categoria> categorias2 = categoriaService.findAll("Filosofia");
		//for (Categoria categoria3 : categorias2) {
			//System.out.println(categoria3.toString());
		//}

		context.close();
	}
}
