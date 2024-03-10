package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.CategoriaService;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        CategoriaService categoriaService = context.getBean("CategoriaServiceImpl", CategoriaService.class);

        // Crud

        // Add
        categoriaService.add(0, "categoria1", "descripcion1");
        System.out.println(">>>>>ADD>>>>>"+categoriaService.findOne(58));

        // Update
        categoriaService.up(58, "categoria2", "descripcion2");
        System.out.println(">>>>>UP>>>>>"+categoriaService.findOne(58));
        // Delete
        categoriaService.delete(58);
        
        try {System.out.println(">>>>>DEL>>>>>"+categoriaService.findOne(58));} catch (Exception e) {e.printStackTrace();}

        // FindAll
        for (Categoria item : categoriaService.findAll()) {
        		System.out.println(item.toString());
        }

        context.close();
    }
}

