package Adapters;

import Abstract.CheckService;
import Edevlet.VerifyTCKN;
import Entities.Player;

public class Edevletadapter implements CheckService {

	@Override
	public boolean check(Player player) {
		VerifyTCKN client = new VerifyTCKN();
		boolean result = false;
		
		try {
			  result = client.isValid(player);
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  }
		 return result;
	}
}