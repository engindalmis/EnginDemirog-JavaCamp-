package Adapters;
import java.rmi.RemoteException;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter   {

	public boolean CheckPersonIdentity(User user) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(user.getCustomer().getNationalityId()),
					user.getCustomer().getFirstName().toUpperCase(),
					user.getCustomer().getLastName().toUpperCase(), 
					user.getCustomer().getBirthYear()
					);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		if(result) {
			System.out.println("Mernis Kaydı Var.");
			return result=true;
			
		}else {
			System.out.println("Mernis Kaydı Yok.Bilgileri Kontrol Ediniz.");
			return result=false;
			
		}
			
	}


}
