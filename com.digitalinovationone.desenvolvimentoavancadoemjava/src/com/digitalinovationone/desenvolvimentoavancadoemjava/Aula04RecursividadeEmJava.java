package com.digitalinovationone.desenvolvimentoavancadoemjava;

public class Aula04RecursividadeEmJava {

	public static void main(String[] args) {
		// Tail Call, tomar cuidado ao utilizar, pode retornar uma Exception StackOverFlowError
		System.out.println(fatorialA(5));
		long t = System.nanoTime();
		System.out.println(t);
	}
	
	private static double fatorialA(double valor) {
		return fatorialComTailCall(valor, 1);
	}
	
	public static double fatorialComTailCall(double valor, double numero) {
		if(valor == 1) {
			return numero;
		}else {
			return fatorialComTailCall(valor - 1, numero * valor);
		}
	}

}
