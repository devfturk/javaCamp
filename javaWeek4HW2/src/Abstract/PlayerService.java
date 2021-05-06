package Abstract;

import Entities.Player;

public interface PlayerService {
	void updateInfo(Player player);
	void newAccount(Player player) ;
	void deleteAccount(Player player);
}
