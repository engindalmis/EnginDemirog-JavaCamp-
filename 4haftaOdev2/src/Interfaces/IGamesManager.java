package Interfaces;

import Entities.Games;

public interface IGamesManager {
	
	public void addGame(Games games);
	public void updateGame(Games games);
	public void deleteGame(Games games);

}
