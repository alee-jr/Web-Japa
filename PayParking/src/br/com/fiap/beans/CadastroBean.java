package br.com.fiap.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class CadastroBean {
	private String nome;
	private String sobrenome;
	private int telefone;
	private String senha;
	private String email;
	private String rg;
	
	public String cadastrar() {
		System.out.println("Cadastrado com sucesso!");
		return "logar";
	}
	
	public void validaEmail(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		String valor = value.toString();
		if(!(valor.contains("@")) && !(valor.contains("."))) {
			throw new ValidatorException(new FacesMessage("Email deve conter '@' e '.' "));
		}
	}
	
	public CadastroBean() {
		super();
	}
	public CadastroBean(String nome, String sobrenome, int telefone, String senha, String email, String rg) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.senha = senha;
		this.email = email;
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
