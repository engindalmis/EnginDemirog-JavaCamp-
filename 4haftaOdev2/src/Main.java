import Controller.CampaignManager;
import Controller.GamesManager;
import Controller.SalesManager;
import Controller.UserManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Games;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		/*Oyuncuların sisteme kayıt olabileceği, bilgilerini güncelleyebileceği, kayıtlarını silebileceği 
		 * bir ortamı simule ediniz. Müşteri bilgilerinin doğruluğunu
		 *  e-devlet sistemlerini kullanarak doğrulama yapmak istiyoruz. 
		 *  (E-devlet sistemlerinde doğrulama TcNo, Ad, Soyad, DoğumYılı bilgileriyle yapılır.
		 *  Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)*/
		
		User user = new User(1,null,new Customer(1,"Engin","Dalmış","11237222684",1988),"engin.dalmis","1234");
		UserManager userManager=new UserManager();
		userManager.registerUser(user);
		
		/*  Oyun satışı yapılabilecek satış ortamını simule ediniz.
		 * ( Yapılan satışlar oyuncu ile ilişkilendirilmelidir.
		 *  Oyuncunun parametre olarak metotta olmasını kastediyorum.)
		 * */
		GamesManager gamesManager=new GamesManager();
		Games games =new Games(1, "FİFA 2021", 520.2);
		gamesManager.addGame(games);
		games.setUser(user);
		SalesManager salesManager=new SalesManager();
		salesManager.sellGame(games);
		/*
		 * Sisteme yeni kampanya girişi, 
		 * kampanyanın silinmesi ve güncellenmesi imkanlarını simule ediniz.*/
		CampaignManager campaignManager =new CampaignManager();
		Campaign campaign=new Campaign(1, "Sevgililer Günü İndirimi", 50);
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		/*Satışlarda kampanya entegrasyonunu simule ediniz.*/
		games.setCampaignDiscount((double) campaign.getDiscountrate());
		salesManager.sellGame(games);
		
		

	}

}
