package ascbank; //Nome do pacote

//

// ==== Imports aqui

//

public class Pessoa { // Nome da classe

// ==== Declaração de atributos
	
	private String nome;
	private String cpf;
	private String profissao;
	private String rg;
	private String email;
	

// ==== Criacao dos métodos da construtores
	public Pessoa() { // Sempre publico e leva o nome da classe
		//metodo contrutor default = preenchimento dos atributos é opcional
	}
	
	public Pessoa(String nome, String cpf, String rg) {
		// nesse metodo contrutor, ao ser instanciado a pessoa é obrigada a passar essas infos
	
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	
public Pessoa(String nome, String cpf, String profissao, String rg, String email, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
		this.rg = rg;
		this.email = email;
		this.telefone = telefone;
	}

// ==== Declaracao dos metodos da classe
	



// ==== Encapsulamento	
	public String getNome() { //get - leitura - responsável por exibir os objetos
		return nome;
	}
	public void setNome(String nome) { //set - gravacao - grava os objetos nos atributos
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	private String telefone;
}


