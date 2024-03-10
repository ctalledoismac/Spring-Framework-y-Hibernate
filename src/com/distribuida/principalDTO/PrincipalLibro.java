package com.distribuida.principalDTO;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        LibroService libroService = context.getBean("libroServiceImpl", LibroService.class);

        // Crud

        // Add
        libroService.add(0, "titulo1", "editorial1", 100, "edicion1", "idioma1", new Date(), "descripcion1", "pasta1", "isbn1", "1", "portada1", "presentacion1", 20.20, 1, 1);
        System.out.println(">>>>>ADD>>>>>"+libroService.findOne(70));

        // Update
        libroService.up(70, "titulo1", "editorial1", 100, "edicion1", "idioma1", new Date(), "descripcion1", "pasta1", "isbn1", "1", "portada1", "presentacion1", 20.20, 1, 1);
        System.out.println(">>>>>UP>>>>>"+libroService.findOne(70));
        // Delete
        libroService.delete(70);
        
        try {System.out.println(">>>>>DEL>>>>>"+libroService.findOne(70));} catch (Exception e) {e.printStackTrace();}

        // FindAll
        for (Libro item : libroService.findAll()) {
        		System.out.println(item.toString());
        }

        context.close();
    }
}

