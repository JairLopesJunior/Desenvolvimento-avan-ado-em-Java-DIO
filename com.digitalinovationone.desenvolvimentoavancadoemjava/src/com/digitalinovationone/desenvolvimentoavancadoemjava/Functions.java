package com.digitalinovationone.desenvolvimentoavancadoemjava;

import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
		Function<String,Integer> converterStringParaInteiro = string -> Integer.valueOf(string);
		System.out.println(retornarNomeAoContrario.apply("Jair")); // Retornando a String ao contrario
		System.out.println(converterStringParaInteiro.apply("23452")); // Retornando a String em Inteiro
		

	}

}
