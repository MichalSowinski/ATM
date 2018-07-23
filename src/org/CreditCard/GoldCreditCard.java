package org.CreditCard;

import org.creditCardHolder.User;

public class GoldCreditCard extends SilverCreditCard {
	
	private int debet;

	public GoldCreditCard(User creditCardHolder, int pin) {
		super(creditCardHolder, pin);
		
	}

	public int getDebet() {
		return debet;
	}

	public void setDebet(int  debet) {
		this.debet = debet;
	}
	
	public void ustawNowyPin(int pin) {
		setPin(pin);
	}

	@Override
	public String toString() {
		return "GoldCreditCard [debet=" + debet + "]";
	}
	
	
	
	

}
