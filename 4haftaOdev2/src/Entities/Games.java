package Entities;

public class Games {
	private int id;
	private String name;
	private Double price;
	private User user;
	private Double campaignDiscount;
	
	
	
	public Games() {
		super();
	}
	
	
	
	public Games(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}



	public Games(int id, String name, Double price, User user) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.user = user;
	}
	
	



	public Games(int id, String name, Double price, User user, Double campaignDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.user = user;
		this.campaignDiscount = campaignDiscount;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		if (campaignDiscount !=null) {
			price-=price*campaignDiscount/100;
			}
		
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}



	public Double getCampaignDiscount() {
		return campaignDiscount;
	}



	public void setCampaignDiscount(Double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}




}
