package Controller;

import Entities.Games;
import Interfaces.IGamesManager;

public class GamesManager implements IGamesManager {

	@Override
	public void addGame(Games games) {
		System.out.println("Oyun Eklenmiştir.");
	}

	@Override
	public void updateGame(Games games) {
		System.out.println("Oyun Güncellenmiştir.");

	}

	@Override
	public void deleteGame(Games games) {
		System.out.println("Oyun Silinmiştir.");
	}

}
