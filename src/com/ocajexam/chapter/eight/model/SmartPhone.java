package com.ocajexam.chapter.eight.model;

public class SmartPhone extends Phone {

	public void sendEmail(String message, String email) {
		System.out.println("SmartPhone: Sending email");
		/* Lóica para enviar email */
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
		/* Procura atividade de email e só continua quando ela não existe. */
		/* Verifica se o telefone está chamando e configura a variável local ringing. */
		return ringing;
	}
}
