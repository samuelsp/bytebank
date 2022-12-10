package br.com.alura.conta;

public class TestaBanco {
	public static void main(String[] args) {
//		Cliente paulo = new Cliente();
//		paulo.setNome("Paulo Silveira");
//		paulo.setCpf("222.222.222.-22");
//		paulo.setProfissao("programador");
//
//		Conta contaDoPaulo = new Conta(6646,969060);
//		contaDoPaulo.deposita(100);
//
//		contaDoPaulo.setTitular(paulo);
//		System.out.println(contaDoPaulo.getTitular().getNome());
//		System.out.println(contaDoPaulo.getTitular());
//		
//		Funcionario samuel = new Funcionario();
//		samuel.setNome("Samuel Silva Pereira Da Cunha");
//		samuel.setCpf("304.449.758-29");
//		samuel.setSalario(4800);
//		
//		System.out.println(samuel.getBonificacao());
//		System.out.println(samuel.toString());
//		
//		Gerente g1 = new Gerente();
//		g1.setNome("Augusto Navalha");
//		g1.setSalario(5000);
//		g1.setSenha(1234);
//		
//		System.out.println(g1.getNome());
//		System.out.println(g1.getBonificacao());
//		System.out.println(g1.autentica(1234));
		
		//Dentro do método main

		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100.0);

		cc.transfere(10.0, cp);
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		System.out.println("CC taxa: " + ContaCorrente.getTaxa());

	}

}
