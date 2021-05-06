package Concrete;

import Abstract.CheckService;
import Entities.Player;

public class CheckManager implements CheckService{

	@Override
	public boolean check(Player player) {
		System.out.println("Player kontrol ediliyor.");
		if (player.getId() == 0) {
			System.out.println("Sahtecilik yapýyosun kýrýyosun beni.");
			return false;
		}
		else {
			System.out.println("Vay gardaþým hoþgeldin.\n" + player.getFirstName());
			return true;
		}
		
	}

}
