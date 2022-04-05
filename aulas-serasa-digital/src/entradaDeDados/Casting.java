package entradaDeDados;

public class Casting {
	
	public static void main(String[] args) {
		//Casting molda um valor para caber em outro tipo, geralmente usado para números
		
		double valor = 7.78965;
		//int outroValor = valor; // Não armazena casas decimais
		//float maisOutroValor = valor; // Tamanhos diferentes
		
		//Fazendo o Casting
		//Casting explícito
		double valor2 = 8.89076;
		int outroValor2 = (int)valor2; //Casting
		float maisOutroValor2 = (float)valor2; //Casting
		
		// Casting explícito = pq mesmo que sejam de tamanhos diferentes, ele molda o valorX ao valorY pq float é menor que double
		float valorX = 4.7895f;
		double valorY = valorX;
		
		//long maisUmValorNovo = outroValor; //Faz o casting automáticamente
	}
}
