package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class PrincipalLibro {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);
        CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
        AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);

        // Add
        Categoria categoria = categoriaDAO.findOne(1);
        Autor autor = autorDAO.findOne(1);
        Libro libro = new Libro(0, "Hola Mundo", "Cr7", 50, "1st", "Espanish", new Date(), "Programacion", "Pasta Blanda", "123456789", "20", "Portada", "Fisico", 50.0, categoria, autor);
 
        //libroDAO.add(libro);

        // Update
        Categoria categoria2 = categoriaDAO.findOne(2);
        Autor autor2 = autorDAO.findOne(2);
        Libro libro2 = new Libro(79, "hi word", "EC", 50, "1st", "Espanish", new Date(), "Programacion", "Pasta Blanda", "123456789", "20", "Portada", "Fisico", 50.0, categoria2, autor2);
 
        //libroDAO.update(libro2);

        // Delete
        //libroDAO.delete(79);

        // FindAll
        List<Libro> libros = libroDAO.findAll();

        for (Libro item : libros) {
             //System.out.println(item.toString());
        }

        // FindOne
        // Libro libro = libroDAO.findOne(1);
        // System.out.println(libro.toString());

        // FindAll Busqueda
        // List<Libro> libros2 = libroDAO.findAll("pam");
        // for (Libro libro3 : libros2) {
        // System.out.println(libro3.toString());

        context.close();
    }
}
