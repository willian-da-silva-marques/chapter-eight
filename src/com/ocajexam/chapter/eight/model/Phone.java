package com.ocajexam.chapter.eight.model;

/**
 * @since 17/01/2020
 * @author willian
 */
public class Phone {

	public void callNumber(long number) {
		System.out.println("Phone: Calling number " + number);
		/* Lógica para discar número e manter a conexão. */
	}
	
	public boolean isRinging() {
		System.out.println("Phone: Checking if phone is ringing");
		boolean ringing = false;
		/* Verifica se o telefone está chamando e configura a variável local ringing. */
		return ringing ;
	}
}
