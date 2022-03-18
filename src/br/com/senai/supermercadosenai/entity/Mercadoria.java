package br.com.senai.supermercadosenai.entity;

public class Mercadoria {
	
	private Integer id;
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

}
