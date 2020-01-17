package com.ocajexam.chapter.eight.coercoes;

public class CoercaoDePrimitivos {

	public static void main(String[] args) {

		/* A coer��o deve ser expl�cita quando a convers�o puder resultar na perda de precis�o. */
		double detailedScore = 1.2;
		float score = (float) detailedScore;
		System.out.println("float: " + score);
		
		/* Se n�o houver perda de precis�o o compilador far� a coer��o automaticamente */
		byte idade = 65;
		short s = idade;
		System.out.println("short: " + s);
		
		/* A coer��o � perdida quando um primitivo maior sofre coer��o para um primitivo menor */
		int i = 1236;
		byte b = (byte) i;
		System.out.println("byte: %d%n"+ b);
	}
}