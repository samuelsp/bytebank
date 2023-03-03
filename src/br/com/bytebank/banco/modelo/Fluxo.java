package br.com.bytebank.banco.modelo;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
     	metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
        	metodo2();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
			e.printStackTrace();			
		}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("deu muito errado");
    }
}