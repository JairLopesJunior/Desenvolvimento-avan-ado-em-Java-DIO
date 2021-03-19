package com.digitalinovationone.desenvolvimentoavancadoemjava;

import java.util.function.UnaryOperator;

public class Aula01ParadigmaFuncional {

	public static void main(String[] args) {
		UnaryOperator<Integer> calcularVezes3 = valor -> valor*3;
		int valor = 10;
		System.out.println("Valor vezes 3 é: " + calcularVezes3.apply(valor));

	}

}
