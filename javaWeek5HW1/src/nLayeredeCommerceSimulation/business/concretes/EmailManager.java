package nLayeredeCommerceSimulation.business.concretes;

import nLayeredeCommerceSimulation.business.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send(String message, String to) {
		System.out.println("E-posta Manager : " + message + " mesaj? " + to + " adresine g?nderildi.");
	}

}