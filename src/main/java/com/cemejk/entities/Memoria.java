package com.cemejk.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "memoria")
public class Memoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_mem;
	private String titulo, descricao, conteudo;

	private LocalDate data;

	@ManyToOne
	@JoinColumn(name = "acervo_id")
	private Acervo acervo;

	public Memoria() {

	}

	public Integer getId_mem() {
		return id_mem;
	}

	public void setId_mem(Integer id_mem) {
		this.id_mem = id_mem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Acervo getAcervo() {
		return acervo;
	}

	public void setAcervo(Acervo acervo) {
		this.acervo = acervo;
	}

	@Override
	public String toString() {
		return "Employee [id= " + id_mem + ", Título= " + titulo + ", Descrição= " + descricao + ", Data= " + data
				+ "]";
	}

}
