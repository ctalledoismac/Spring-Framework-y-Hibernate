package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        LibroService libroService = context.getBean("libroServiceImpl", LibroService.class);

        // Add
        //libroService.add(0, "Hola Mundo", "Cr7", 50, "1st", "Espanish", new Date(), "Programacion", "Pasta Blanda", "123456789", "20", "Portada", "Fisico", 50.0, 1, 1);

        // Update
        //libroService.up(79, "hi word", "EC", 50, "1st", "Espanish", new Date(), "Programacion", "Pasta Blanda", "123456789", "20", "Portada", "Fisico", 50.0, 2, 2);

        // Delete
        //libroService.delete(79);

        // FindAll
        List<Libro> libros = libroService.findAll();

        for (Libro item : libros) {
             //System.out.println(item.toString());
        }

        // FindOne
        Libro libro3 = libroService.findOne(1);
        //System.out.println(libro3.toString());

        // FindAll Busqueda
        //List<Libro> libros2 = libroService.findAll("action");
        //for (Libro libro3 : libros2) {
        //    System.out.println(libro3.toString());
        //}	
        		
        context.close();
    }
}
