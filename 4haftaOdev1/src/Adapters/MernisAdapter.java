package Adapters;

import java.rmi.RemoteException;

import Concrete.CustomerCheckManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter extends CustomerCheckManager  {

	public boolean CheckPersonIdentity(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirthYear()
					);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		if(result) {
			return result=true;
		}else {
			return result=false;
		}
			
	}


}
