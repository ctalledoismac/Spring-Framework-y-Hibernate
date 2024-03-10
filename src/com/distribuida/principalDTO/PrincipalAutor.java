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
        autorService.add(0, "nombre1", "apellido1", "pais1", "direccion1", "telefono1", "correo1");
        System.out.println(">>>>>ADD>>>>>"+autorService.findOne(58));

        // Update
        autorService.update(58, "nombre1ssd", "apellido1ssd", "pais1ssd", "direccion1", "telefono1", "correo1");
        System.out.println(">>>>>UP>>>>>"+autorService.findOne(58));
        // Delete
        autorService.delete(58);
        
        try {System.out.println(">>>>>DEL>>>>>"+autorService.findOne(58));} catch (Exception e) {e.printStackTrace();}

        // FindAll
        for (Autor item : autorService.findAll()) {
        		System.out.println(item.toString());
        }

        context.close();
    }
}

