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

					"Menu:\n1.Wp�a� pieni�dze\n2.Wyp�a� pieni�dze\n3.Stan konta\n4.Zmie� kod PIN\n5.Dane W�a�ciciela"
							+ "\n6.Historia operacji\n7.Tw�j debet\n8.Zako�cz");
			goldMenuInt = Integer.parseInt(goldMenu);

			if (goldMenuInt == 1) {
				String payment = JOptionPane.showInputDialog(
						"Jak� kwot� chcesz wp�aci�?\n1.50z�\n2.100z�\n3.200z�.\n4.500z�\n5.inna kwota");
				int paymentInteger = Integer.parseInt(payment);
				if (paymentInteger == 1) {
					accountBalance = accountBalance + 50;
					history.add("+50 z�");

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

			if (goldMenuInt == 2) {
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

			else if (goldMenuInt == 3) {
				sumOfDebetandAccountBalance = debet + accountBalance;
				JOptionPane.showMessageDialog(null, "Tw�j stan konta to:" + "\nPodstawowy stan konta:" + accountBalance
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
				JOptionPane.showMessageDialog(null, "Dane w�a�ciciela konta:" + u3);

			}

			else if (goldMenuInt == 6) {
				JOptionPane.showInputDialog("Opcja w trakcie pisania");
			}

			else if (goldMenuInt == 7) {
				String menuDebet = JOptionPane.showInputDialog(
						"Menu zarz�dzania debetem:\n1.Zmie� wielko�� debetu\n2.Wy�wietl aktualny stan debetu");
				int menuDebetConvert = Integer.parseInt(menuDebet);
				if (menuDebetConvert == 1) {
					String newDebet = JOptionPane
							.showInputDialog("Tw�j aktualny debet to:" + " " + debet + "\nWpisz now� wielko�� debetu:"
									+ "\nWskaz�wka: Wielko�� debetu nie mo�e przekracza� 30000!");
					int newDebetConvert = Integer.parseInt(newDebet);
					if (newDebetConvert <= 30000) {
						goldCreditCard.setDebet(newDebetConvert);
						JOptionPane.showMessageDialog(null, "Debet zosta� zmieniony!");
						debet = newDebetConvert;
					} else if (newDebetConvert > 30000) {
						JOptionPane.showMessageDialog(null,
								"Wielko�� debetu, kt�ry chcesz ustawi� jest za du�a! Spr�buj jeszce raz");
					}

				} else if (menuDebetConvert == 2) {

					JOptionPane.showMessageDialog(null, "Wielko�� Twojego debetu to:" + debet);

				}
			}

		} while (goldMenuInt != 8);
		JOptionPane.showMessageDialog(null, "Dzi�kujemy i zapraszamy ponownie!");

	}
}
