package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.AutorService;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        AutorService autorService = context.getBean("autorServiceImpl", AutorService.class);

        // Crud

        // Add
        //autorService.add(0, "nombre1", "apellido1", "pais1", "direccion1", "telefono1", "correo1");

        // Update
        autorService.update(61, "nombre1ssd", "apellido1ssd", "pais1ssd", "direccion1", "telefono1", "correo1");

        // Delete
        autorService.delete(55);        

        // FindAll
        //List<Autor> autores = autorService.findAll();
        //for (Autor item : autores) {
        //	System.out.println(item.toString());
        //}

        // FindOne
        //Autor autor3 = autorService.findOne(1);
        //System.out.println(autor3.toString());

        // FindAll Busqueda
        //List<Autor> autores2 = autorService.findAll("pam");
        //for (Autor autor3 : autores2) {
        //    System.out.println(autor3.toString());
        //}

        context.close();
    }
}

