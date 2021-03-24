package com.digitalinovationone.desenvolvimentoavancadoemjava;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		Predicate<String> estaVazia = valor -> valor.isEmpty();
		System.out.println(estaVazia.test("")); // Metodo test Verifica se a String esta vazia ou não e retorna true or false
		System.out.println(estaVazia.test("Jair"));

	}

}
