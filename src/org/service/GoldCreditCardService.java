package org.service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.CreditCard.GoldCreditCard;
import org.creditCardHolder.User;

public class GoldCreditCardService {
	private GoldCreditCard goldCreditCard;

	public GoldCreditCardService(GoldCreditCard goldCreditCard) {
		this.goldCreditCard = goldCreditCard;
	}

	public void process3() {
		int debet = 1000;
		int accountBalance = 0;
		int sumOfDebetandAccountBalance = debet + accountBalance;
		int goldMenuInt;
		int pinOfUser = goldCreditCard.getPin();
		List<String> history = new ArrayList<>();
		

		do {

			String goldMenu = JOptionPane.showInputDialog(

					"Menu:\n1.Wp³aæ pieni¹dze\n2.Wyp³aæ pieni¹dze\n3.Stan konta\n4.Zmieñ kod PIN\n5.Dane W³aœciciela"
							+ "\n6.Historia operacji\n7.Twój debet\n8.Zakoñcz");
			goldMenuInt = Integer.parseInt(goldMenu);

			if (goldMenuInt == 1) {
				String payment = JOptionPane.showInputDialog(
						"Jak¹ kwotê chcesz wp³aciæ?\n1.50z³\n2.100z³\n3.200z³.\n4.500z³\n5.inna kwota");
				int paymentInteger = Integer.parseInt(payment);
				if (paymentInteger == 1) {
					accountBalance = accountBalance + 50;
					history.add("+50 z³");

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

			if (goldMenuInt == 2) {
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

			else if (goldMenuInt == 3) {
				sumOfDebetandAccountBalance = debet + accountBalance;
				JOptionPane.showMessageDialog(null, "Twój stan konta to:" + "\nPodstawowy stan konta:" + accountBalance
						+ "\nDebet:" + debet + "\n Razem:" + sumOfDebetandAccountBalance);

			}

			else if (goldMenuInt == 4) {

				String askAboutPin = JOptionPane.showInputDialog("Podaj kod pin");
				int convertAskAboutPin = Integer.parseInt(askAboutPin);
				if (convertAskAboutPin == pinOfUser) {
					String newPin = JOptionPane.showInputDialog("Podaj nowy kod PIN:");
					int convertNewPin = Integer.parseInt(newPin);
					goldCreditCard.ustawNowyPin(convertNewPin);
					pinOfUser = convertNewPin;

				}

			}

			else if (goldMenuInt == 5) {
				User u3 = goldCreditCard.getCreditCardHolder();
				JOptionPane.showMessageDialog(null, "Dane w³aœciciela konta:" + u3);

			}

			else if (goldMenuInt == 6) {
				JOptionPane.showInputDialog("Opcja w trakcie pisania");
			}

			else if (goldMenuInt == 7) {
				String menuDebet = JOptionPane.showInputDialog(
						"Menu zarz¹dzania debetem:\n1.Zmieñ wielkoœæ debetu\n2.Wyœwietl aktualny stan debetu");
				int menuDebetConvert = Integer.parseInt(menuDebet);
				if (menuDebetConvert == 1) {
					String newDebet = JOptionPane
							.showInputDialog("Twój aktualny debet to:" + " " + debet + "\nWpisz now¹ wielkoœæ debetu:"
									+ "\nWskazówka: Wielkoœæ debetu nie mo¿e przekraczaæ 30000!");
					int newDebetConvert = Integer.parseInt(newDebet);
					if (newDebetConvert <= 30000) {
						goldCreditCard.setDebet(newDebetConvert);
						JOptionPane.showMessageDialog(null, "Debet zosta³ zmieniony!");
						debet = newDebetConvert;
					} else if (newDebetConvert > 30000) {
						JOptionPane.showMessageDialog(null,
								"Wielkoœæ debetu, który chcesz ustawiæ jest za du¿a! Spróbuj jeszce raz");
					}

				} else if (menuDebetConvert == 2) {

					JOptionPane.showMessageDialog(null, "Wielkoœæ Twojego debetu to:" + debet);

				}
			}

		} while (goldMenuInt != 8);
		JOptionPane.showMessageDialog(null, "Dziêkujemy i zapraszamy ponownie!");

	}
}
