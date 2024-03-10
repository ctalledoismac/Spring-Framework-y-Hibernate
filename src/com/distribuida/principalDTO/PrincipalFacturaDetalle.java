package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.FacturaDetalleService;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDetalle {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        FacturaDetalleService facturaDetalleService = context.getBean("facturaDetalleServiceImpl", FacturaDetalleService.class);

        // Crud

        // Add
        facturaDetalleService.add(0, 10, 15.20, 1, 1);
        System.out.println(">>>>>ADD>>>>>"+facturaDetalleService.findOne(85));

        // Update
        facturaDetalleService.up(85, 10, 15.20, 3, 3);
        System.out.println(">>>>>UP>>>>>"+facturaDetalleService.findOne(85));
        // Delete
        facturaDetalleService.del(85);
        
        try {System.out.println(">>>>>DEL>>>>>"+facturaDetalleService.findOne(85));} catch (Exception e) {e.printStackTrace();}

        // FindAll
        for (FacturaDetalle item : facturaDetalleService.findAll()) {
        		System.out.println(item.toString());
        }

        context.close();
    }
}

