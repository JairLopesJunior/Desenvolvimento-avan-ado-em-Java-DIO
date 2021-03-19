package com.digitalinovationone.desenvolvimentoavancadoemjava;

import java.util.Arrays;

public class Aula02FuncoesEImutabilidade {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		
		// Retornando numeros pares, multiplicados  pro 2
		Arrays.stream(array)
			.filter(f -> f % 2 == 0)
			.map(m -> m*2)
			.forEach(f -> System.out.println(f));

	}

}
