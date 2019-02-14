package com.mil.deliveryfast.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedido {
	
	private Integer numero;
	
	private Usuario usuario;
	private FormaDePago formaDePago;
	
	private String calleOrigen;
	private String numeroCalleOrigen;
	private String pisoOrigen;
	private String deptoOrigen;
	private Ciudad ciudadOrigen;
	
	private String calleDestino;
	private String numeroCalleDestino;
	private String pisoDestino;
	private String deptoDestino;
	private Ciudad ciudadDestino;
	
	private BigDecimal montoEntregado;
	private BigDecimal comision;
	private BigDecimal vuelto;
	
	private String detalle;
	private Boolean idaYVuelta;
	
	private LocalDateTime fechaHoraCreacion;
	
	public Pedido() {
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public FormaDePago getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}

	public String getCalleOrigen() {
		return calleOrigen;
	}

	public void setCalleOrigen(String calleOrigen) {
		this.calleOrigen = calleOrigen;
	}

	public String getNumeroCalleOrigen() {
		return numeroCalleOrigen;
	}

	public void setNumeroCalleOrigen(String numeroCalleOrigen) {
		this.numeroCalleOrigen = numeroCalleOrigen;
	}

	public String getPisoOrigen() {
		return pisoOrigen;
	}

	public void setPisoOrigen(String pisoOrigen) {
		this.pisoOrigen = pisoOrigen;
	}

	public String getDeptoOrigen() {
		return deptoOrigen;
	}

	public void setDeptoOrigen(String deptoOrigen) {
		this.deptoOrigen = deptoOrigen;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCalleDestino() {
		return calleDestino;
	}

	public void setCalleDestino(String calleDestino) {
		this.calleDestino = calleDestino;
	}

	public String getNumeroCalleDestino() {
		return numeroCalleDestino;
	}

	public void setNumeroCalleDestino(String numeroCalleDestino) {
		this.numeroCalleDestino = numeroCalleDestino;
	}

	public String getPisoDestino() {
		return pisoDestino;
	}

	public void setPisoDestino(String pisoDestino) {
		this.pisoDestino = pisoDestino;
	}

	public String getDeptoDestino() {
		return deptoDestino;
	}

	public void setDeptoDestino(String deptoDestino) {
		this.deptoDestino = deptoDestino;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public BigDecimal getMontoEntregado() {
		return montoEntregado;
	}

	public void setMontoEntregado(BigDecimal montoEntregado) {
		this.montoEntregado = montoEntregado;
	}

	public BigDecimal getComision() {
		return comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}

	public BigDecimal getVuelto() {
		return vuelto;
	}

	public void setVuelto(BigDecimal vuelto) {
		this.vuelto = vuelto;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Boolean getIdaYVuelta() {
		return idaYVuelta;
	}

	public void setIdaYVuelta(Boolean idaYVuelta) {
		this.idaYVuelta = idaYVuelta;
	}
	
	public LocalDateTime getFechaHoraCreacion() {
		return fechaHoraCreacion;
	}

	public void setFechaHoraCreacion(LocalDateTime fechaHoraCreacion) {
		this.fechaHoraCreacion = fechaHoraCreacion;
	}

	public BigDecimal calcularTotalPedido() {
		return BigDecimal.ZERO;
	}
	
	public BigDecimal calcularVuelto() {
		return BigDecimal.ZERO;
	}
	
	@Override
	public String toString() {
		return "Pedido #" + numero;
	}
}
