package com.distribuida.entities;

public class FacturaDetalle {

	private int idFacturaDetalle;
	private int Cantidad;
	private Double Subtotal;
	
	private Factura factura;
	
	private Libro libro;
	
	public FacturaDetalle() {
		
	}

	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}

	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public Double getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(Double subtotal) {
		Subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", Cantidad=" + Cantidad + ", Subtotal="
				+ Subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
}
