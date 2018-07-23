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

					"Menu:\n1.Wp�a� pieni�dze\n2.Wyp�a� pieni�dze\n3.Stan konta\n4.Zmie� kod PIN\n5.Dane W�a�ciciela"
							+ "\n6.Historia operacji\n7.Zako�cz");
			bronzeMenuInt = Integer.parseInt(bronzeMenu);

			if (bronzeMenuInt == 1) {
				String payment = JOptionPane.showInputDialog(
						"Jak� kwot� chcesz wp�aci�?\n1.50z�\n2.100z�\n3.200z�.\n4.500z�\n5.inna kwota");
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
					String askHowMuch = JOptionPane.showInputDialog("Jak� kwot� chcesz wp�aci�?");
					int convertAskHowMuch = Integer.parseInt(askHowMuch);
					accountBalance = accountBalance + convertAskHowMuch;

				}

				else if (paymentInteger > 5) {
					JOptionPane.showMessageDialog(null, "operacja niedozwolna. Spr�buj jeszcze raz!");

				}

			}

			if (bronzeMenuInt == 2) {
				String payment = JOptionPane.showInputDialog(
						"Jak� kwot� chcesz wyp�aci�?\n1.50z�\n2.100z�\n3.200z�.\n4.500z�\n5.inna kwota");
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
					String askHowMuch = JOptionPane.showInputDialog("Jak� kwot� chcesz wyp�aci�?");
					int convertAskHowMuch = Integer.parseInt(askHowMuch);
					accountBalance = accountBalance - convertAskHowMuch;

				}

			}

			else if (bronzeMenuInt == 3) {
				JOptionPane.showMessageDialog(null, "Tw�j stan konta to:" + accountBalance);

			}

			else if (bronzeMenuInt == 4) {
				JOptionPane.showMessageDialog(null, "operacje niedozwolona dla br�zowej karty!");
				

			}
			
			else if(bronzeMenuInt ==5){
			User u =	bronzeCreditCard.getCreditCardHolder();
			JOptionPane.showMessageDialog(null, "Dane w�a�ciciela konta:" + u);
	
			}

		} while (bronzeMenuInt != 7);JOptionPane.showMessageDialog(null, "Dzi�kujemy i zapraszamy ponownie!");

	}
}
