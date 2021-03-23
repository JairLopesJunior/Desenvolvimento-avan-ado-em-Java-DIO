package com.digitalinovationone.desenvolvimentoavancadoemjava;

public class Aula03LambdaNoJava {

	public static void main(String[] args) {
		//Funcao f = valor -> valor;

		Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor; // Se ter somente uma instrução não é necessario usar chaves
		System.out.println(colocarPrefixoSenhorNaString.gerar("Jair"));
		Funcao colocarPrefixoSenhorNaString2 = valor2 -> {
			String nomeComSenhor = "Sr. " + valor2;
			String nomeComSenhorEPontoFinal = nomeComSenhor + ".";
			return nomeComSenhorEPontoFinal;
		};
		System.out.println(colocarPrefixoSenhorNaString2.gerar("Joao"));
	}

}

//@FunctionalInterface
//interface Funcao{
//	String retornaString(String valor);
//}

@FunctionalInterface
interface Funcao{
	String gerar(String valor);
}
