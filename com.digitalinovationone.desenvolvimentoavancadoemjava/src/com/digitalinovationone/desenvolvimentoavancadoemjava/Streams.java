package com.digitalinovationone.desenvolvimentoavancadoemjava;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		String[] nomes = {"Jair", "Paulo", "Oliveira", "Santos", "Instrutor", "Java"};
		Integer[] numeros = {1, 2, 3, 4, 5};
		imprimirNomesFiltrados(nomes);
		imprimirODobroDeCadaItemDaLista(numeros);
	}
	
	private static void imprimirNomesFiltrados(String... nomes) {
		String nomesParaImprimir = Stream.of(nomes)
							.filter(f -> f.equals("Jair"))
							.collect(Collectors.joining()); // Ele pega cada valor do Array de String
		
		System.out.println(nomesParaImprimir);
		
		Stream.of(nomes)
			//.forEach(System.out::println); // Existe este jeito e o de bbaixo
			.forEach(paraCada -> System.out.println(paraCada));
	}
	
	public static void imprimirODobroDeCadaItemDaLista(Integer... numeros) {
		Stream.of(numeros)
		.forEach(n -> System.out.println(n*2));
	}

}
