package com.ocajexam.chapter.eight.coercoes;

import com.ocajexam.chapter.eight.coercoes.model.ClassA;
import com.ocajexam.chapter.eight.coercoes.model.ClassB;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class CoercaoDeObjetos {

	private static final Logger LOGGER = LoggerFactory.getLogger(CoercaoDeObjetos.class);

	public static void main(String[] args) {

		ClassB obj1 = new ClassB();
		ClassA obj2 = new ClassB();
		ClassA obj3 = new ClassA();
		
		System.out.println("obj1: " + obj1.whoAmI());
		System.out.println("obj2: " + obj2.whoAmI());
		System.out.println("obj3: " + obj3.whoAmI());
		System.out.println();
		
		/*
		 * A variável obj2 é declarada como sendo do tipo ClassA, mas, foi inicializada
		 * com o tipo ClassB.
		 * 
		 * Então em tempo de execução o comportamento resultante será de acordo com um
		 * objeto ClassB.
		 * 
		 * A variável obj2 sendo do tipo ClassA, só poderá ser tratada dessa forma, como
		 * um objeto ClassA.
		 * 
		 * Por conta disso a linha abaixo não compilará jamais.
		 */
//		System.out.println("obj2: " + obj2.specialClassBMethod());
		
		/* Para que a variável obj2 tenha acesso as funcionalidades da ClassB, será necessário que haja uma (coerção) para o tipo ClassB. */
		ClassB obj4 = (ClassB) obj2;
		System.out.println("obj2: " + obj4.specialClassBMethod());
		
		// Exemplo de coerção inline
		System.out.println("obj2 - coerção inline: " + ((ClassB) obj2).specialClassBMethod());
		
		try {// Exemplo de coerção inválida
			System.out.println("obj2: " + ((ClassB) obj3).specialClassBMethod());
		} catch (ClassCastException e) {
			LOGGER.error(e.getMessage());
		}		
	}
}