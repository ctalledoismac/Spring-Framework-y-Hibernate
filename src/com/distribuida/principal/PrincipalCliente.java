package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		ClienteDAO clienteDAO  = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		//CRUD
		//Add
		//Cliente cliente2 = new Cliente(0, "123467899", "Jogg", "Larrs", "Rio", "0241667455", "Lars@gmail.com");
		//clienteDAO.add(cliente2);
		
		//Cliente cliente3 = new Cliente(0, "11581878984", "Jarsrr", "Rarrs", "Rio", "02518455", "Rarrs@gmail.com");
		//Update
		//clienteDAO.up(cliente3);
		
		//Delete
		clienteDAO.del(39);
		
		//FinAll
		List<Cliente> clientes = clienteDAO.finAll();
				
		//FinOne
		Cliente cliente = clienteDAO.findOne(1);
				
		
		for (Cliente item : clientes) {
			System.out.println(item.toString());
		}
		
		//System.out.println(cliente.toString());
		
		context.close();
	}

}
