package Concrete;

import Abstract.SellingService;
import Entities.Game;
import Entities.Player;

public class SellingManager implements SellingService {

	@Override
	public void sell(Game game, Player player) {
		
		System.out.println(game.getName() + " adlý oyun " + player.getId() + " Id ye sahip hesaba eklendi.");
		
	}

}
