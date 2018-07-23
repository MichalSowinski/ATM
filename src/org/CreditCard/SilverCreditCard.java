package org.CreditCard;

import org.creditCardHolder.User;

public class SilverCreditCard extends BronzeCreditCard {

	public SilverCreditCard(User creditCardHolder, int pin) {
		super(creditCardHolder, pin);
		
	}
	
	
	
	


	public  void ustawNowyPin(int pin) {
		setPin(pin);
	}

}
