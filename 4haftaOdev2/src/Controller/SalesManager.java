package Controller;

import Entities.Games;

public class SalesManager {
	
	public void sellGame(Games game) {
		if (game.getCampaignDiscount()==null) {
			System.out.println(game.getName()+" ürünü "+game.getUser().getUserName()+
					" adlı kullanıcıya " +game.getPrice()+" TL ye Satılmıştır.");
		}else {
			System.out.println(game.getName()+" ürünü "+game.getUser().getUserName()+
					" adlı kullanıcıya % "+game.getCampaignDiscount()+" indirim uygulanarak " +game.getPrice()+" TL ye Satılmıştır.");
		}
			
			
			
		
	}
	

}
