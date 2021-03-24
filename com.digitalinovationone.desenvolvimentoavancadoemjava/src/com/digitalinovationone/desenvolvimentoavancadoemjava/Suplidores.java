package com.digitalinovationone.desenvolvimentoavancadoemjava;

import java.util.function.Supplier;

public class Suplidores {

	public static void main(String[] args) {
		//Supplier<Pessoa> instanciaPessoa =  Pessoa::new;
		Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
		System.out.println(instanciaPessoa.get());
		
		
	}

}

class Pessoa{
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		nome = "Jair";
		idade = 23;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
}
