package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void play(Game game) {
		System.out.println("Oyanayal�m bakal�m: " + game.getName());
	}

}
