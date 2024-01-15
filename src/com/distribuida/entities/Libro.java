package com.distribuida.entities;

import java.util.Date;

public class Libro {

	private int idLibro;
	private String Titulo;
	private String Editorial;
	private int numPaginas;
	private String Edicion;
	private String Idioma;
	private Date fechaPublicacion;
	private String Descripcion;
	private String tipoPasta;
	private String ISBN;
	private String numEjemplares;
	private String Portada;
	private String Presentacion;
	private double Precio;
	
	private Categoria categoria;
	
	private Autor autor;
	
	public Libro() {
		
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getEdicion() {
		return Edicion;
	}

	public void setEdicion(String edicion) {
		Edicion = edicion;
	}

	public String getIdioma() {
		return Idioma;
	}

	public void setIdioma(String idioma) {
		Idioma = idioma;
	}

	public Date getFechaPublicacionl() {
		return fechaPublicacion;
	}

	public void setFechaPublicacionl(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getTipoPasta() {
		return tipoPasta;
	}

	public void setTipoPasta(String tipoPasta) {
		this.tipoPasta = tipoPasta;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(String numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public String getPortada() {
		return Portada;
	}

	public void setPortada(String portada) {
		Portada = portada;
	}

	public String getPresentacion() {
		return Presentacion;
	}

	public void setPresentacion(String presentacion) {
		Presentacion = presentacion;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", Titulo=" + Titulo + ", Editorial=" + Editorial + ", numPaginas="
				+ numPaginas + ", Edicion=" + Edicion + ", Idioma=" + Idioma + ", Descripcion=" + Descripcion
				+ ", tipoPasta=" + tipoPasta + ", ISBN=" + ISBN + ", numEjemplares=" + numEjemplares + ", Portada="
				+ Portada + ", Presentacion=" + Presentacion + ", Precio=" + Precio + ", categoria=" + categoria
				+ ", autor=" + autor + "]";
	}
	
}
