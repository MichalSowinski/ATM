package org.main;

import java.util.List;

import javax.swing.JOptionPane;

import org.CreditCard.BronzeCreditCard;
import org.CreditCard.GoldCreditCard;
import org.CreditCard.SilverCreditCard;
import org.creditCardHolder.User;
import org.initialize.Initialize;
import org.service.BronzeCreditCardService;
import org.service.GoldCreditCardService;
import org.service.SilverCreditCardService;
import org.userCredencialsService.UserCredencialsService;

public class Application {

	public static List<User> users;
	public static UserCredencialsService userCredencialsService = new UserCredencialsService();
	public static BronzeCreditCard creditCard;
//	public static GoldCreditCard creditCard2;

	public static void main(String[] args) {
		users = Initialize.createUsers();

				String programStart = JOptionPane.showInputDialog("Witaj! Podaj ID:");
		int idInt = Integer.parseInt(programStart);

		User user = null;
		try {
			user = userCredencialsService.findUserById(users, idInt);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nie znaleziono u¿ytkownika!");
			System.exit(0);
		}

		boolean czyPoprawny = false;
		int iloscProb = 0;
		do {
			String pin = JOptionPane.showInputDialog("Podaj kod PIN:");
			int pinInt = Integer.parseInt(pin);

			try {
				creditCard = userCredencialsService.findCreditCardByPin(user, pinInt);
				czyPoprawny = true;
			} catch (Exception e) {
				iloscProb++;
				JOptionPane.showMessageDialog(null, "Podales niepoprawny PIN. Pozostalo " + (3-iloscProb) + " prob");
			}
			// sprawdzenie pinu

			
		} while (!czyPoprawny && iloscProb < 3);

		if (!czyPoprawny) {
			// trzeba zakonczyc program
			JOptionPane.showMessageDialog(null, "Podales 3 razy niepoprawny PIN.Karta Zablokowana!");
			System.exit(0);
		}
		
		String className = creditCard.getClass().getSimpleName();
		if(className.startsWith("Bronze")) {
			BronzeCreditCardService service = new BronzeCreditCardService(creditCard);
			service.process();
		}
		else if(className.startsWith("Silver")){
			SilverCreditCardService service2 = new SilverCreditCardService((SilverCreditCard)creditCard);
			service2.process2();
		}
			
		else if(className.startsWith("Gold")){
				GoldCreditCardService service3 = new GoldCreditCardService((GoldCreditCard)creditCard);
				service3.process3();
			}
			
			
			
		}


		
		
		

	}


