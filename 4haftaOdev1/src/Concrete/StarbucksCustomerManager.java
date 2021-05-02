package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckServise;
import Adapters.MernisAdapter;
import Entities.Customer;
import Utils.CheckServiceUtils;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckServise customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckServise customerCheckService) {
		this.customerCheckService = customerCheckService;
	}




	@Override
	public void save(Customer customer) {

		boolean result =  CheckServiceUtils.runCheckServices(new boolean[] {
				customerCheckService.CheckPersonIdentity(customer), 
				
				});
		
		if(result) {
			System.out.println("işlem başarılı");
			super.save(customer);
			return;
		}else {
			System.out.println("Sıkıntı var");
		}
		
		
	}
}
