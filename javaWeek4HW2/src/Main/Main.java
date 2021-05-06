package Main;

import Adapters.Edevletadapter;
import Concrete.*;
import Entities.*;


public class Main {

	public static void main(String[] args) {
		PlayerManager playerManager = new PlayerManager(new Edevletadapter());
		SellingManager sellingManager = new SellingManager();
		CampaignManager campaignManager = new CampaignManager();
		
		Player fturkPlayer = new Player(1, "furkan", "türk",1998 , "12345678901");
		Player enginDemirogplayer = new Player();
		Campaign campaign = new Campaign(1, "DEV ÝNDÝRÝM", 10);
		Game game = new Game(1, "K.Online", 19.90, "MMORPG");
		try {
			playerManager.newAccount(fturkPlayer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			playerManager.newAccount(enginDemirogplayer);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
