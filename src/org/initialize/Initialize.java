package org.initialize;

import java.util.ArrayList;
import java.util.List;

import org.CreditCard.BronzeCreditCard;
import org.CreditCard.GoldCreditCard;
import org.CreditCard.SilverCreditCard;
import org.creditCardHolder.User;

public class Initialize {

	public static List<User> createUsers() {

		List<User> listOfUsers = new ArrayList<>();

		User firstUser = new User("Jan Kowalski", "Wroc³aw 00-450,Poniatowskiego 30", 556987456, 234562);
		GoldCreditCard goldCreditCard = new GoldCreditCard(firstUser, 34567);
		SilverCreditCard silverCreditCard2 = new SilverCreditCard(firstUser, 9635);
		firstUser.addCard(goldCreditCard);
		firstUser.addCard(silverCreditCard2);
		listOfUsers.add(firstUser);

		User secondUser = new User("Adam Nowak", "Warszawa 05-880,Bieniewicka 30", 432543654, 345673);
		SilverCreditCard silverCreditCard = new SilverCreditCard(secondUser, 5434);
		secondUser.addCard(silverCreditCard);
		listOfUsers.add(secondUser);

		User thirdUser = new User("Adrian Sikorski", "Kraków 02-340,Krakowska 32", 654987321, 456784);
		BronzeCreditCard bronzeCreditCard3 = new BronzeCreditCard(thirdUser, 3452);
		GoldCreditCard goldCreditCard3 = new GoldCreditCard(thirdUser, 75395);
		thirdUser.addCard(bronzeCreditCard3);
		thirdUser.addCard(goldCreditCard3);
		listOfUsers.add(thirdUser);

		User fourthUser = new User("Mariusz S³owacki", "Gdañsk 06-240,Gdañska 14", 654357951, 567895);
		BronzeCreditCard bronzeCreditCard4 = new BronzeCreditCard(fourthUser, 43333);
		fourthUser.addCard(bronzeCreditCard4);
		listOfUsers.add(fourthUser);
		
		User fifthUser= new User("Arkadiusz Ziêtek", "Sopot,Potocka 29", 756951852, 246806);
		BronzeCreditCard bronzeCreditCard5 = new BronzeCreditCard(fifthUser, 3451 );
		fifthUser.addCard(bronzeCreditCard5);
		listOfUsers.add(fifthUser);
		

		return listOfUsers;

	}

}
