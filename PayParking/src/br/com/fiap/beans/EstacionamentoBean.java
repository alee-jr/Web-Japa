package br.com.fiap.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import sun.util.calendar.LocalGregorianCalendar.Date;
@ManagedBean
public class EstacionamentoBean {
	private String endereco;
	private String nome;
	private String razao;
	private int cnpj;
	private String responsavel;
	private String rg;
	private int quantidade;
	private Date horario;
	private double preco;
	
	public void cadastrar() {
		System.out.println("Estacionamento registrado!");
		FacesMessage mensagem = new FacesMessage("Estacionamento registrado!");
		FacesContext.getCurrentInstance().addMessage( null , mensagem);	
	}
	
	public void validaDados(FacesContext context, UIComponent component, Object value) throws ValidatorException{
		String valor = value.toString();
		if(valor.contains("@") || valor.contains("#") || valor.contains("'")) {
			throw new ValidatorException(new FacesMessage("Não pode conter caracteres especiais!"));
		}
		
	}

	public EstacionamentoBean() {
		super();
	}

	public EstacionamentoBean(String endereco, String nome, String razao, int cnpj, String responsavel, String rg,
			int quantidade, Date horario, double preco) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.razao = razao;
		this.cnpj = cnpj;
		this.responsavel = responsavel;
		this.rg = rg;
		this.quantidade = quantidade;
		this.horario = horario;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
