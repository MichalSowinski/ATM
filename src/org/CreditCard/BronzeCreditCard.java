package org.CreditCard;

import org.creditCardHolder.User;

public class BronzeCreditCard {
	private User creditCardHolder;
	private int pin;

	public User getCreditCardHolder() {
		return creditCardHolder;
	}

	public void setCreditCardHolder(User creditCardHolder) {
		this.creditCardHolder = creditCardHolder;
	}

	public int getPin() {
		return pin;
	}
	
	protected void setPin(int pin) {
		this.pin = pin;
	}

	public BronzeCreditCard(User creditCardHolder, int pin) {
		super();
		this.creditCardHolder = creditCardHolder;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "BronzeCreditCard [creditCardHolder=" + creditCardHolder + ", pin=" + pin + "]";
	}

}
