package org.service;

import javax.swing.JOptionPane;

import org.CreditCard.BronzeCreditCard;
import org.creditCardHolder.User;

public class BronzeCreditCardService {

	private BronzeCreditCard bronzeCreditCard;

	public BronzeCreditCardService(BronzeCreditCard bronzeCreditCard) {
		this.bronzeCreditCard = bronzeCreditCard;
	}

	public void process() {

		int bronzeMenuInt;
		int accountBalance = 0;
		int pinOfUser = bronzeCreditCard.getPin();
		do {

			String bronzeMenu = JOptionPane.showInputDialog(

					"Menu:\n1.Wp³aæ pieni¹dze\n2.Wyp³aæ pieni¹dze\n3.Stan konta\n4.Zmieñ kod PIN\n5.Dane W³aœciciela"
							+ "\n6.Historia operacji\n7.Zakoñcz");
			bronzeMenuInt = Integer.parseInt(bronzeMenu);

			if (bronzeMenuInt == 1) {
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

			if (bronzeMenuInt == 2) {
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

			else if (bronzeMenuInt == 3) {
				JOptionPane.showMessageDialog(null, "Twój stan konta to:" + accountBalance);

			}

			else if (bronzeMenuInt == 4) {
				JOptionPane.showMessageDialog(null, "operacje niedozwolona dla br¹zowej karty!");
				

			}
			
			else if(bronzeMenuInt ==5){
			User u =	bronzeCreditCard.getCreditCardHolder();
			JOptionPane.showMessageDialog(null, "Dane w³aœciciela konta:" + u);
	
			}

		} while (bronzeMenuInt != 7);JOptionPane.showMessageDialog(null, "Dziêkujemy i zapraszamy ponownie!");

	}
}
