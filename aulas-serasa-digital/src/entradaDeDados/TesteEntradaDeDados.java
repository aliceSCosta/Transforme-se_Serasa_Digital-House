package entradaDeDados;

import java.util.Scanner; //Ctrl+Shift+O faz todas as importa��es necess�rias e remove as que n�o s�o usadas

public class TesteEntradaDeDados {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in); //System.in significa entrada de dados padr�o
		
		System.out.println("Informe um nome completo: ");
		String nome = entradaDeDados.nextLine(); // NextLine pega o nome todo, o next s� pega o primeiro nome pq ele n�o pega espa�o	
		
		System.out.println("Nome informado �: "+nome);
		
		System.out.println("Informe sua idade: ");
		int idade = entradaDeDados.nextInt();
		
		System.out.println("Idade informada: "+idade);
		
		//Durante a aula teve um problema de buffer usando o nextLine *pesquisar
		//Buscar entender mais o que � tipo primitivo e o que n�o �
		
		String sexo = entradaDeDados.next();
		System.out.println("Sexo informado: "+sexo);
	}
	
			
}
