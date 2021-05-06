package Concrete;

import Abstract.BasePlayerManager;
import Abstract.CheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager extends BasePlayerManager{
	private CheckService checkService;
	
	
	public PlayerManager(CheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void updateInfo(Player player) {
		super.updateInfo(player);
	}

	@Override
	public void deleteAccount(Player player) {
		super.deleteAccount(player);
	}

	@Override
	public void newAccount(Player player) {
		
		if (checkService.check(player)) {
			super.newAccount(player);
		} else {
			System.out.println("Hata oluþtu kaydedilemedi.");
		}
	}

	@Override
	public boolean check(Player player) {
		// TODO Auto-generated method stub
		return false;
	}


}
