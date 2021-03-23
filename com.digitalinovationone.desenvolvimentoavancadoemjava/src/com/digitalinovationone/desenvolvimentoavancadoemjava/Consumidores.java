package com.digitalinovationone.desenvolvimentoavancadoemjava;

import java.util.function.Consumer;

public class Consumidores {

	public static void main(String[] args) {
		// Method Reference
		
		// -apenas
		// - Utilizar o parametro da forma que ele foi recebido:
		
		Consumer<String> imprimirFrase = System.out::println;
		Consumer<String> imprimiUmaFrase2 = frase -> System.out.println(frase);
		imprimirFrase.accept("Hello World");

	}

}
