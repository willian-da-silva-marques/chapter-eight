package com.ocajexam.chapter.eight.coercoes;

public class CoercaoDePrimitivos {

	public static void main(String[] args) {

		/* A coerção deve ser explícita quando a conversão puder resultar na perda de precisão. */
		double detailedScore = 1.2;
		float score = (float) detailedScore;
		System.out.println("float: " + score);
		
		/* Se não houver perda de precisão o compilador fará a coerção automaticamente */
		byte idade = 65;
		short s = idade;
		System.out.println("short: " + s);
		
		/* A coerção é perdida quando um primitivo maior sofre coerção para um primitivo menor */
		int i = 1236;
		byte b = (byte) i;
		System.out.println("byte: %d%n"+ b);
	}
}