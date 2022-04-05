package entradaDeDados;

import java.util.Scanner; //Ctrl+Shift+O faz todas as importações necessárias e remove as que não são usadas

public class TesteEntradaDeDados {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in); //System.in significa entrada de dados padrão
		
		System.out.println("Informe um nome completo: ");
		String nome = entradaDeDados.nextLine(); // NextLine pega o nome todo, o next só pega o primeiro nome pq ele não pega espaço	
		
		System.out.println("Nome informado é: "+nome);
		
		System.out.println("Informe sua idade: ");
		int idade = entradaDeDados.nextInt();
		
		System.out.println("Idade informada: "+idade);
		
		//Durante a aula teve um problema de buffer usando o nextLine *pesquisar
		//Buscar entender mais o que é tipo primitivo e o que não é
		
		String sexo = entradaDeDados.next();
		System.out.println("Sexo informado: "+sexo);
	}
	
			
}
