package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ClienteService clienteService = context.getBean("ClienteServiceImpl", ClienteService.class);

        // Crud

        // Add
        clienteService.add(0, "cedula1", "nombre1", "apellido1", "direccion1", "telefono1", "correo1");
        System.out.println(">>>>>ADD>>>>>"+clienteService.findOne(58));

        // Update
        clienteService.up(58, "cedula2", "nombre2", "apellido2", "direccion2", "telefono2", "correo2");
        System.out.println(">>>>>UP>>>>>"+clienteService.findOne(58));
        // Delete	
        clienteService.del(58);
        
        try {System.out.println(">>>>>DEL>>>>>"+clienteService.findOne(58));} catch (Exception e) {e.printStackTrace();}

        // FindAll
        for (Cliente item : clienteService.finAll()) {
        		System.out.println(item.toString());
        }

        context.close();
    }
}

