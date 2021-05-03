package Entities;

public class Campaign {

	private int id;
	private String campaignName;
	private int discountrate;
	public Campaign() {
		super();
	}
	public Campaign(int id, String campaignName, int discountrate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountrate = discountrate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscountrate() {
		return discountrate;
	}
	public void setDiscountrate(int discountrate) {
		this.discountrate = discountrate;
	}
	
	
}
