package com.ocajexam.chapter.eight;

import com.ocajexam.chapter.eight.model.Phone;
import com.ocajexam.chapter.eight.model.SmartPhone;

/**
 * @since 17/01/2020
 * @author willian.marques 
 * Polimorfismo via herança de classes.
 */
public class TestaPolimorfismoViaHerancaDeClasses {

	public static void main(String[] args) {
		new TestaPolimorfismoViaHerancaDeClasses();
	}

	public TestaPolimorfismoViaHerancaDeClasses() {
		Phone landLinePhone = new Phone();
		SmartPhone smartPhone = new SmartPhone();

		System.out.println("About to test a land line phone as a phone...");
		testPhone(landLinePhone);

		System.out.println("\nAbout to test a smart phone as a phone...");
		testPhone(smartPhone);

		System.out.println("\nAbout to test a smart phone as a smart phone...");
		testSmartPhone(smartPhone);
	}

	private void testPhone(Phone phone) {
		phone.callNumber(5559869447L);
		phone.isRinging();
	}

	private void testSmartPhone(SmartPhone smartPhone) {
		smartPhone.sendEmail("Hi", "edward@ocajexam.com");
		smartPhone.retrieveEmail();
	}
}
