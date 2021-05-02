package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
KPSPublicSoapProxy kpsPublic =new KPSPublicSoapProxy();
boolean result =kpsPublic.TCKimlikNoDogrula(
		Long.parseLong("11237222684"),
		"ENGİN",
		"Dalmış",
		1987);
System.out.println("doğrulama : "+ (result ? 
		"başarılı": "başarısız"));

	}

}
