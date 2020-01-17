package com.ocajexam.chapter.eight.coercoes;

@SuppressWarnings("unused")
public class CoercaoEntrePrimitivosEObjetos {

	public static void main(String[] args) {

		int value = 8;
		Integer integer1 = new Integer(value);
		Integer integer2 = (Integer) value;
		Integer integer3 = value;

		Float float1 = 5.7f;

		/* A situação a seguir é inválida
		 * Ao contrário do que ocorre com um primitivo, em que um float é truncado automaticamente
		 * para caber em um int, um objeto Float não é truncado automaticamente para caber em
		 * um objeto Integer. 
		 * */
		
//		Integer integer4 = float1;
	}
}
