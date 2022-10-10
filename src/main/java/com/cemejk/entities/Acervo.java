package com.cemejk.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "acervo")
public class Acervo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_acervo;

	private Integer ano_acervo;

	public Acervo() {

	}

	public Integer getId_acervo() {
		return id_acervo;
	}

	public void setId_acervo(Integer id_acervo) {
		this.id_acervo = id_acervo;
	}

	public Integer getAno_acervo() {
		return ano_acervo;
	}

	public void setAno_acervo(Integer ano_acervo) {
		this.ano_acervo = ano_acervo;
	}

}
