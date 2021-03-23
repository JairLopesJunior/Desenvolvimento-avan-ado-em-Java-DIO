package com.digitalinovationone.desenvolvimentoavancadoemjava;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Aula02FuncoesEImutabilidade {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		
		// Retornando numeros pares, multiplicados  pro 2
		Arrays.stream(array)
			.filter(f -> f % 2 == 0)
			.map(m -> m*2)
			.forEach(f -> System.out.println(f));

		
		// Funções Puras - LAMBDA
		BiPredicate<Integer, Integer> verificarSeMaior =
				(parametro, valorComparacao) -> parametro > valorComparacao;
		
		System.out.println(verificarSeMaior.test(12, 13)); // False
		System.out.println(verificarSeMaior.test(13, 12)); // True
		
		// Imutabilidade
		int valor = 20;
		UnaryOperator<Integer> retornarDobro = v -> v * 2;
		System.out.println(retornarDobro.apply(valor)); // Retorna o dobro do Valor
		System.out.println(valor); // Valor não sera alterado
	}

}
