package org.service;

import javax.swing.JOptionPane;

import org.CreditCard.SilverCreditCard;
import org.creditCardHolder.User;

public class SilverCreditCardService {
	private SilverCreditCard silverCreditCard;

	public SilverCreditCardService(SilverCreditCard silverCreditCard) {
		this.silverCreditCard = silverCreditCard;
	}

	public void process2() {
		int silverMenuInt;
		int accountBalance = 0;
		int pinOfUser = silverCreditCard.getPin();
		do {

			String silverMenu = JOptionPane.showInputDialog(

					"Menu:\n1.Wp³aæ pieni¹dze\n2.Wyp³aæ pieni¹dze\n3.Stan konta\n4.Zmieñ kod PIN\n5.Dane W³aœciciela"
							+ "\n6.Historia operacji\n7.Zakoñcz");
			silverMenuInt = Integer.parseInt(silverMenu);

			if (silverMenuInt == 1) {
				String payment = JOptionPane.showInputDialog(
						"Jak¹ kwotê chcesz wp³aciæ?\n1.50z³\n2.100z³\n3.200z³.\n4.500z³\n5.inna kwota");
				int paymentInteger = Integer.parseInt(payment);
				if (paymentInteger == 1) {
					accountBalance = accountBalance + 50;

				} else if (paymentInteger == 2) {
					accountBalance = accountBalance + 100;

				}

				else if (paymentInteger == 3) {
					accountBalance = accountBalance + 200;

				}

				else if (paymentInteger == 4) {
					accountBalance = accountBalance + 500;

				}

				else if (paymentInteger == 5) {
					String askHowMuch = JOptionPane.showInputDialog("Jak¹ kwotê chcesz wp³aciæ?");
					int convertAskHowMuch = Integer.parseInt(askHowMuch);
					accountBalance = accountBalance + convertAskHowMuch;

				}

				else if (paymentInteger > 5) {
					JOptionPane.showMessageDialog(null, "operacja niedozwolna. Spróbuj jeszcze raz!");

				}

			}

			if (silverMenuInt == 2) {
				String payment = JOptionPane.showInputDialog(
						"Jak¹ kwotê chcesz wyp³aciæ?\n1.50z³\n2.100z³\n3.200z³.\n4.500z³\n5.inna kwota");
				int paymentInteger = Integer.parseInt(payment);
				if (paymentInteger == 1) {
					accountBalance = accountBalance - 50;

				} else if (paymentInteger == 2) {
					accountBalance = accountBalance - 100;

				}

				else if (paymentInteger == 3) {
					accountBalance = accountBalance - 200;

				}

				else if (paymentInteger == 4) {
					accountBalance = accountBalance - 500;

				}

				else if (paymentInteger == 5) {
					String askHowMuch = JOptionPane.showInputDialog("Jak¹ kwotê chcesz wyp³aciæ?");
					int convertAskHowMuch = Integer.parseInt(askHowMuch);
					accountBalance = accountBalance - convertAskHowMuch;

				}

			}

			else if (silverMenuInt == 3) {
				JOptionPane.showMessageDialog(null, "Twój stan konta to:" + accountBalance);

			}

			else if (silverMenuInt == 4) {
				
				String askAboutPin =JOptionPane.showInputDialog("Podaj kod pin");
				int convertAskAboutPin = Integer.parseInt(askAboutPin);
				if(convertAskAboutPin==pinOfUser){
				String newPin = JOptionPane.showInputDialog("Podaj nowy kod PIN:");
				int convertNewPin = Integer.parseInt(newPin);
				silverCreditCard.ustawNowyPin(convertNewPin);
				pinOfUser = convertNewPin;
				
		
					
				}
				

			}

			else if (silverMenuInt == 5) {
				User u2 = silverCreditCard.getCreditCardHolder();
				JOptionPane.showMessageDialog(null, "Dane w³aœciciela konta:" + u2);

			}

		} while (silverMenuInt != 7);
		JOptionPane.showMessageDialog(null, "Dziêkujemy i zapraszamy ponownie!");

	}
}
