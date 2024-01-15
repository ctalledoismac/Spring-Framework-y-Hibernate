package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Autor;

public interface AutorDAO {
	
	public List<Autor> finAll();
	
	public Autor FinOne(int id);
	
	public void add(Autor autor);
	
	public void up(Autor autor);
	
	public void del(int id);
	
	//
	public List<Autor> finAll(String busqueda) ;
	
}
