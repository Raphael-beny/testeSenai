package br.com.senai.supermercadosenai.entity;

import java.time.LocalDate;

public class Compra {
	
	private LocalDate data;
	
	private Integer id;
	
	public LocalDate getData() {
		return data;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	

}
