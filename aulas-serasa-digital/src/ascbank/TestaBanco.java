package ascbank;

public class TestaBanco {
	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa();
//		pessoaNumero1.nome = "Jose das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "472.940.324-08";
//		
//		System.out.println("Nome: "+pessoaNumero1.nome);
//		System.out.println("Profissão: "+pessoaNumero1.profissao);
//		System.out.println("CPF: "+pessoaNumero1.cpf);
		
	//===================================================================
		
//		Pessoa pessoaNova = new Pessoa();
//		
//		pessoaNova.setNome("Jose da Couves");
//		System.out.println("Nome: "+pessoaNova.getNome());
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa("Jose dos Tomates", "472.940.324-08", "123.456-78");
//		
//		System.out.println("Nome: "+pessoaComConstrutor1.getNome());
//		System.out.println("CPF: "+pessoaComConstrutor1.getCpf());
//		System.out.println("RG:"+pessoaComConstrutor1.getRg());
//		
	//====================================================================
		
		Conta conta1 = new Conta();
				
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(2500000.98); // não se deve alterar diretamente essa informação. Ela apenas pode ser exibida
		conta1.setTitular("Alice Costa");
		
		conta1.depositar(1000000.0);
		
		System.out.println("Agência: "+conta1.getAgencia());
		System.out.println("Conta: "+conta1.getNumeroConta());
		System.out.println("Titular: "+conta1.getTitular());
		System.out.printf("Saldo Atual: R$ %.2f\n",conta1.getSaldo());
		
		if(conta1.sacar(20.0)){
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Verifique o valor da saque.");
		}
		
		System.out.printf("Saldo Atual: R$ %.2f\n",conta1.getSaldo());
		
		
		Conta conta2 = new Conta();
		
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(10000.0, conta2);
		System.out.printf("Saldo Atual Alice: R$ %.2f\n",conta1.getSaldo());
		System.out.printf("Saldo Atual Léo: R$ %.2f\n",conta2.getSaldo());


		
	}
	
}
