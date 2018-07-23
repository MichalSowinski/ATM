package org.userCredencialsService;

import java.util.List;

import org.CreditCard.BronzeCreditCard;
import org.creditCardHolder.User;

public class UserCredencialsService {

	public User findUserById(List<User> users, int id) throws Exception {
		for (int i = 0; i < users.size(); i++) {
			User u1 = users.get(i);
			int idU1 = u1.getId();

			if (id == idU1) {
				return u1;
			}

		}
		throw new Exception("Nie znaleziono uzytkownika");
	}

	public BronzeCreditCard findCreditCardByPin(User u, int pin) throws Exception {
		List<BronzeCreditCard> lista = u.getListOfCards();
		for(int i=0;i<lista.size();i++){
			BronzeCreditCard b1 = lista.get(i);
			int pin2 = b1.getPin();
			
			if(pin==pin2){
				return b1;
			}
			
			
		}
	
		throw new Exception("Nie znaleziono karty kredytowej o podanym pinie");
	}

}
