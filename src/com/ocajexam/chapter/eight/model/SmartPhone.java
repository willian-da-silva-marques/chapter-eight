package com.ocajexam.chapter.eight.model;

public class SmartPhone extends Phone {

	public void sendEmail(String message, String email) {
		System.out.println("SmartPhone: Sending email");
		/* L�ica para enviar email */
	}

	public String retrieveEmail() {
		System.out.println("SmartPhone: Retrieving email");
		String messages = "";
		/* Retorna uma String contendo todas as mesnsagens */
		return messages;
	}

	@Override
	public boolean isRinging() {
		System.out.println("SmartPhone: Checking if phone is ringing");
		boolean ringing = false;
		/* Procura atividade de email e s� continua quando ela n�o existe. */
		/* Verifica se o telefone est� chamando e configura a vari�vel local ringing. */
		return ringing;
	}
}
