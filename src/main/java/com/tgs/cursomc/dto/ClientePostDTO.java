package com.tgs.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.tgs.cursomc.services.validation.ClienteInsert;

@ClienteInsert
public class ClientePostDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Preenchimento do nome é obrigatório")
	@Size(min=5, max=80, message="O nome deve ter entre 5 a 100 caracteres")
	private String nome;
	
	@NotEmpty(message="Preenchimento do email obrigatório")
	@Email(message="Email inválido")
	private String email;
	
	private String  cpfCnpj;
	private Integer tipoCliente;
	
	@NotEmpty(message="Preenchimento da senha é obrigatório")
	private String senha;
	
	@NotEmpty(message="Preenchimento do logradouro é obrigatório")
	private String 	logradouro;
	
	@NotEmpty(message="Preenchimento do numero é obrigatório")
	private String 	numero;
	private String 	complemento;
	private String 	bairro;
	
	@NotEmpty(message="Preenchimento do cep é obrigatório")
	private String 	cep;	
	
	@NotEmpty(message="Preenchimento do telefone1 é obrigatório")
	private String 	telefone1;
	private String 	telefone2;
	private String 	telefone3;
	private Long   	idCidade;
	
	public ClientePostDTO() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Integer getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(Integer tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}	
}
