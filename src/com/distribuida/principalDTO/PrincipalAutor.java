package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dto.AutorService;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        AutorService autorService = context.getBean("autorServiceImpl", AutorService.class);

        // Crud

        // Add
        //Autor autor = new Autor(0, "nombre1", "apellido1", "pais1", "direccion1", "telefono1", "correo1");
        //autorService.add(autor);

        // Update
        //Autor autor2 = new Autor(61, "nombre1ssd", "apellido1ssd", "pais1ssd", "direccion1", "telefono1", "correo1");
        //autorService.update(autor2);

        // Delete
        autorService.delete(55);
        autorService.delete(56);
        autorService.delete(57);
        autorService.delete(58);
        autorService.delete(59);
        autorService.delete(60);
        autorService.delete(61);
        

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

