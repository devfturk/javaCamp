package Abstract;

import Entities.Player;

public abstract class BasePlayerManager implements CheckService,PlayerService{

	@Override
	public void updateInfo(Player player) {
		// TODO Auto-generated method stub
		System.out.println("Bilgileriniz g�ncelleniyor. " + player.getFirstName());
		
	}

	@Override
	public void newAccount(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(Player player) {
		System.out.println("Gitti b�t�n emekler. " + player.getId() + " Id li hesap sistemden kald�r�ld�.");
		
	}
	

}
