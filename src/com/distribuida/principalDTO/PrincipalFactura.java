package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.FacturaService;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaService facturaService = context.getBean("facturaServiceImpl", FacturaService.class);
		
		//add
		//facturaService.add(0, "FAC-0090", new Date(), 22.0, 1.0, 23.0, 1); 

		//up
		//facturaService.up(86, "FAC-0090", new Date(), 23.0, 2.0, 25.0,2); 
		
		//del
		//facturaService.del(86);
		
		//findALL	
		List<Factura> facturas = facturaService.findAll();
		
		for (Factura item : facturas){
			System.out.println(item);
		}
		
		//findOne
		//Factura factura = facturaService.findOne(1);
			//System.out.println(factura.toString());
		
		
		
		
		context.close();

	}

}
