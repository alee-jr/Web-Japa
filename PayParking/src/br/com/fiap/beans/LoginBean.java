package br.com.fiap.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class LoginBean {
	private String usuario;
	private String senha;
	private boolean termo;
	
	public String logar() {
		if(getUsuario().equals("ale") && getSenha().equals("123")){
			System.out.println("Usuario logado: "+getUsuario());
			System.out.println(isTermo());
			return "index?faces-redirect=true";
		}else {
			FacesMessage mensagem = new FacesMessage("Usuário inválido!");
			FacesMessage mensagem2 = new FacesMessage("Senha inválida!");
			FacesContext.getCurrentInstance().addMessage( null , mensagem);			
			FacesContext.getCurrentInstance().addMessage( null , mensagem2);
			return "logar";
		}
		
	}
	
	public LoginBean() {
		super();
	}
	public LoginBean(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isTermo() {
		return termo;
	}
	public void setTermo(boolean termo) {
		this.termo = termo;
	}
	
	
}
