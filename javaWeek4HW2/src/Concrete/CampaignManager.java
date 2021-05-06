package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("OO gençler yine iyisiniz kampanya geldi: " + campaign.getName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("kampanya is dead: " + campaign.getName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
	
		System.out.println("kampanya güncellendi: " + campaign.getName());
		
	}

}
