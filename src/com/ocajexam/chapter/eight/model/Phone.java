package com.ocajexam.chapter.eight.model;

/**
 * @since 17/01/2020
 * @author willian
 */
public class Phone {

	public void callNumber(long number) {
		System.out.println("Phone: Calling number " + number);
		/* L�gica para discar n�mero e manter a conex�o. */
	}
	
	public boolean isRinging() {
		System.out.println("Phone: Checking if phone is ringing");
		boolean ringing = false;
		/* Verifica se o telefone est� chamando e configura a vari�vel local ringing. */
		return ringing ;
	}
}
