package entradaDeDados;

public class Casting {
	
	public static void main(String[] args) {
		//Casting molda um valor para caber em outro tipo, geralmente usado para n�meros
		
		double valor = 7.78965;
		//int outroValor = valor; // N�o armazena casas decimais
		//float maisOutroValor = valor; // Tamanhos diferentes
		
		//Fazendo o Casting
		//Casting expl�cito
		double valor2 = 8.89076;
		int outroValor2 = (int)valor2; //Casting
		float maisOutroValor2 = (float)valor2; //Casting
		
		// Casting expl�cito = pq mesmo que sejam de tamanhos diferentes, ele molda o valorX ao valorY pq float � menor que double
		float valorX = 4.7895f;
		double valorY = valorX;
		
		//long maisUmValorNovo = outroValor; //Faz o casting autom�ticamente
	}
}
