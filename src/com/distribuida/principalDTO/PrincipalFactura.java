package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.FacturaService;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        FacturaService facturaService = context.getBean("facturaServiceImpl", FacturaService.class);

        // Crud

        // Add
        facturaService.add(0, "FAC-001", new Date(), 17.50, 0.12, 19.00, 1);
        System.out.println(">>>>>ADD>>>>>"+facturaService.findOne(60));

        // Update
        facturaService.up(60, "FAC-001", new Date(), 17.50, 0.12, 19.00, 1);
        System.out.println(">>>>>UP>>>>>"+facturaService.findOne(60));
        // Delete
        facturaService.del(60);
        
        try {System.out.println(">>>>>DEL>>>>>"+facturaService.findOne(60));} catch (Exception e) {e.printStackTrace();}

        // FindAll
        for (Factura item : facturaService.findAll()) {
        		System.out.println(item.toString());
        }

        context.close();
    }
}

