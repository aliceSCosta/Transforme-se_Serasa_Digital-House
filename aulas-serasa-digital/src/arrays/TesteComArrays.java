package arrays;

public class TesteComArrays {
	public static void main(String[] args) {
		
		// Formas de declarar um array
		
		// Array unidimensional => vetor
		
		int [] idades = {1, 5, 7, 80, 45}; // já está inicializado -> pq já tem valores
		int[] idades2 = new int[5]; //não possui dados escritos pelo usario -> tamanho 5
		
		String[] nomes = {"Julia", "Marcia", "Ana"};
		String[] nomes2 = new String[3];
		
		//int idades [];
		//int[] idades; // Forma mais comum de se declarar
		
		
		
		System.out.println("Idade:" + idades[3] + "- Nome: " + nomes[0]);	
		
		
		//Imprimir tudo
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idades: " + idades[i]); // é o i que vai dentro pq é ele que vai ir alterando as posicoes
		}
		
		// Ou
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Nomes: " + nomes[i]);
		}
		
		// Arrays multidimensionais => matriz
		
		int[][] numeros = new int [3][3];
		int valor = 1;
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				numeros[linha][coluna] = valor++;
			}
		}
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print(numeros[linha][coluna] + "\t");
			}
			System.out.println();
		}
		
		//Matriz já inicializada
		
		int[][] randomicos = {
				{8,12,78,96},
				{22,79,45,96},
				
		};
	}
}
