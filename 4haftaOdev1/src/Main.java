
import Abstract.ICustomerCheckServise;
import Abstract.ICustomerService;
import Adapters.MernisAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;



public class Main {

	public static void main(String[] args) {
		Customer enginCustomer = new Customer();
		enginCustomer.setId(1);
		enginCustomer.setNationalityId("11237222684");
		enginCustomer.setFirstName("Engin");
		enginCustomer.setLastName("Dalmış");
		enginCustomer.setDateOfBirthYear(1988);
		
		ICustomerService customerService = new StarbucksCustomerManager(new MernisAdapter());
		customerService.save(enginCustomer);

	}

}
