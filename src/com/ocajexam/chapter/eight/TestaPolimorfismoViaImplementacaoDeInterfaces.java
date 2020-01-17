package com.ocajexam.chapter.eight;

import com.ocajexam.chapter.eight.model.Describable;
import com.ocajexam.chapter.eight.model.Goat;
import com.ocajexam.chapter.eight.model.GoatShelter;
import com.ocajexam.chapter.eight.model.SavannahElephant;

/**
 * @since 17/01/2020
 * @author willian.marques 
 * Polimorfismo via implementação de interfaces.
 */
public class TestaPolimorfismoViaImplementacaoDeInterfaces {

	public static void main(String[] args) {
		new TestaPolimorfismoViaImplementacaoDeInterfaces();
	}

	public TestaPolimorfismoViaImplementacaoDeInterfaces() {
		Goat goat = new Goat("Bob");
		
		GoatShelter shelter = new GoatShelter(4, 4, 6);
		
		SavannahElephant elephant = new SavannahElephant("Loxodonta Africana", 60, 22, "Herbívoro");
		
		System.out.println(description(goat));

		System.out.println(description(shelter));
		
		System.out.println(description(elephant));
	}

	private String description(Describable goat) {
		return goat.getDescription();
	}
}
