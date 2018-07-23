package org.creditCardHolder;

import java.util.ArrayList;
import java.util.List;

import org.CreditCard.BronzeCreditCard;

public class User {
	private String nameAndSurname;
	private String address;
	private int phoneNumber;
	private List<BronzeCreditCard> listOfCards;
	private int id;

	public String getNameAndSurname() {
		return nameAndSurname;
	}

	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<BronzeCreditCard> getListOfCards() {
		return listOfCards;
	}

	public void setListOfCards(List<BronzeCreditCard> listOfCards) {
		this.listOfCards = listOfCards;
	}
	
	public void addCard(BronzeCreditCard bronzeCreditCard) {
		listOfCards.add(bronzeCreditCard);
	}

	public User(String nameAndSurname, String address, int phoneNumber, int id) {
		super();
		this.nameAndSurname = nameAndSurname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.listOfCards = new ArrayList<>();
		this.id = id;

	}

	@Override
	public String toString() {
		return "\n Imiê i nazwisko:" + nameAndSurname + "\n Adres zamieszkania:" + address + "\n Numer telefonu:" + phoneNumber
				+ "\n ID:" + id + "";
	}

}
