package com.digitalinovationone.desenvolvimentoavancadoemjava;

public class Aula03LambdaNoJava {

	public static void main(String[] args) {
		//Funcao f = valor -> valor;

		Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
		System.out.println(colocarPrefixoSenhorNaString.gerar("Jair"));
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
