package Interfaces;

import Entities.Campaign;

public interface ICampaignManager {
	
	public void add(Campaign campaign) ;
	public void update(Campaign campaign);
	public void delete(Campaign campaign);

}
