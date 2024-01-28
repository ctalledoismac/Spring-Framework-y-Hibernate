package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.dto.AutorService;
import com.distribuida.dto.CategoriaService;
import com.distribuida.dto.LibroService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        LibroService libroService = context.getBean("libroServiceImpl", LibroService.class);
        CategoriaService categoriaService = context.getBean("categoriaServiceImpl", CategoriaService.class);
        AutorService autorService = context.getBean("autorServiceImpl", AutorService.class);

        // Add
        Categoria categoria = categoriaService.findOne(1);
        Autor autor = autorService.findOne(1);
        Libro libro = new Libro(0, "Hola Mundo", "Cr7", 50, "1st", "Espanish", new Date(), "Programacion", "Pasta Blanda", "123456789", "20", "Portada", "Fisico", 50.0, categoria, autor);
 
        //libroService.add(libro);

        // Update
        //Categoria categoria2 = categoriaDAO.findOne(2);
        //Autor autor2 = autorDAO.findOne(2);
        //Libro libro2 = new Libro(79, "hi word", "EC", 50, "1st", "Espanish", new Date(), "Programacion", "Pasta Blanda", "123456789", "20", "Portada", "Fisico", 50.0, categoria2, autor2);
 
        //libroService.update(libro2);

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
