package ascbank; //Nome do pacote

//

// ==== Imports aqui

//

public class PessoaHeranca { // Nome da classe

// ==== Declaração de atributos
	
	private String nome;
	private String email;
	private String telefone;
	

// ==== Criacao dos métodos da construtores
	
	public PessoaHeranca() { // Sempre publico e leva o nome da classe
		//metodo contrutor default = preenchimento dos atributos é opcional
	}
	
	
	public PessoaHeranca(String nome, String email, String telefone) {

		this.nome = nome;
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
	
}


