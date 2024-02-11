package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class PrincipalFacturaDetalle {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        FacturaDetalleDAO facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl", FacturaDetalleDAO.class);
        FacturaDAO facturaDAO = context.getBean("facturaDAOImpl", FacturaDAO.class);
        LibroDAO libroDAO = context.getBean("libroDAOImpl", LibroDAO.class);

        // Add
        Factura factura = facturaDAO.findOne(1);
        Libro libro = libroDAO.findOne(1);
        FacturaDetalle facturaDetalle = new FacturaDetalle(0, 1, 25.0, factura, libro);
        //facturaDetalleDAO.add(facturaDetalle);

        // Update
        Factura factura2 = facturaDAO.findOne(2);
        Libro libro2 = libroDAO.findOne(2);
        FacturaDetalle facturaDetalle2 = new FacturaDetalle(210, 50, 55.0, factura2, libro2);
        //facturaDetalleDAO.update(facturaDetalle2);

        // Delete
        facturaDetalleDAO.delete(210);

        // FindAll
        List<FacturaDetalle> facturaDetalles = facturaDetalleDAO.findAll();

        for (FacturaDetalle item : facturaDetalles) {
            //System.out.println(item.toString());
        }

        context.close();
    }
}
