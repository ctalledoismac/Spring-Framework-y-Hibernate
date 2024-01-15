package com.distribuida.entities;

import java.sql.Date;

public class Factura {

	private int idFactura;
	private String numFactura;
	private Date Fecha;
	private Double totalNeto;
	private Double Iva;
	private Double Total;
	
	private Cliente cliente;
	
	public Factura() {
		
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}

	public Double getIva() {
		return Iva;
	}

	public void setIva(Double iva) {
		Iva = iva;
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		Total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", Fecha=" + Fecha + ", totalNeto="
				+ totalNeto + ", Iva=" + Iva + ", Total=" + Total + ", cliente=" + cliente + "]";
	}
	
}
