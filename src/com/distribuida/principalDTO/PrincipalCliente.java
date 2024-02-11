package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		ClienteService clienteService  = context.getBean("clienteServiceImpl", ClienteService.class);
		
		//CRUD
		//Add
		//clienteService.add(0, "1234678993", "Jogg3", "Larrs3", "Rio", "0241667455", "Lars@gmail.com");
		
		//Update
		//clienteService.up(44, "11581878984", "Jarsrr", "Rarrs", "Rio", "02518455", "Rarrs@gmail.com");
		
		//Delete
		//clienteService.del(44);
		
		//FinOne
		//Cliente cliente = clienteService.findOne(1);
			//System.out.println(cliente.toString());
		
		//FinAll
		//List<Cliente> clientes = clienteService.finAll();
		
		//for (Cliente item : clientes) {
			//System.out.println(item.toString());
		//}
		
		
		
		context.close();
	}

}
