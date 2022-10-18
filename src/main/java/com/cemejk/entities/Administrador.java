package com.cemejk.entities;

import java.io.Serializable;
<<<<<<< HEAD
import java.sql.Date;
import java.time.LocalDate;
=======
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "administrador")
public class Administrador implements UserDetails, Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_admin;
<<<<<<< HEAD
	private String nome, email;
	private String senha;
	private LocalDate data_criacao;
	
	public Administrador(String nome, String email, String senha, LocalDate data_criacao) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.data_criacao = data_criacao;
	}

=======
	private String nome, funcaoEscolar, email;
	private String senha;
	
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534
	public Administrador() {

	}

	public Long getId_admin() {
		return id_admin;
	}

	public void setId_admin(Long id_admin) {
		this.id_admin = id_admin;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

<<<<<<< HEAD
=======
	public String getFuncaoEscolar() {
		return funcaoEscolar;
	}

	public void setFuncaoEscolar(String funcaoEscolar) {
		this.funcaoEscolar = funcaoEscolar;
	}

>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
<<<<<<< HEAD
	
	public LocalDate getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(LocalDate data_criacao) {
		this.data_criacao = data_criacao;
	}

	@Override
	public String toString() {
		return "Employee [id= " + id_admin + ", Nome= " + nome + "Email= "
=======

	@Override
	public String toString() {
		return "Employee [id= " + id_admin + ", Nome= " + nome + ", Função Escolar= " + funcaoEscolar + ", email= "
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534
				+ email + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.senha;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
