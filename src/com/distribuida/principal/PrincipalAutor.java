package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);

        // Crud

        // Add
        Autor autor = new Autor(0, "nombre1", "apellido1", "pais1", "direccion1", "telefono1", "correo1");
        autorDAO.add(autor);

        // Update
        Autor autor2 = new Autor(50, "nombre1", "apellido1", "pais1", "direccion1", "telefono1", "correo1");
        autorDAO.update(autor2);

        // Delete
        // autorDAO.delete(54);

        // FindAll
        List<Autor> autores = autorDAO.findAll();

        for (Autor item : autores) {
            System.out.println(item.toString());
        }

        // FindOne
        // Autor autor = autorDAO.findOne(1);
        // System.out.println(autor.toString());

        // FindAll Busqueda
        List<Autor> autores2 = autorDAO.findAll("pam");
        for (Autor autor3 : autores2) {
            System.out.println(autor3.toString());
        }

        context.close();
    }
}

