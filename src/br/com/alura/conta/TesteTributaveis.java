package br.com.alura.conta;

public class TesteTributaveis{

    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.calcular(cc);
        calc.calcular(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
