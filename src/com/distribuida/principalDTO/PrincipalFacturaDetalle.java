package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.FacturaDetalleService;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDetalle {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        FacturaDetalleService facturaDetalleService = context.getBean("facturaDetalleServiceImpl", FacturaDetalleService.class);

        // Add
        //facturaDetalleService.add(0, 1, 25.0, 1, 1);

        // Update
        //facturaDetalleService.up(210, 50, 55.0, 2, 2);

        // Delete
        facturaDetalleService.del(210);

        // FindAll
        List<FacturaDetalle> facturaDetalles = facturaDetalleService.findAll();

        for (FacturaDetalle item : facturaDetalles) {
            //System.out.println(item.toString());
        }

        context.close();
    }
}
