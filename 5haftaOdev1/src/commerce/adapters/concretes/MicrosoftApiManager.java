package commerce.adapters.concretes;

import commerce.adapters.abstracts.AuthenticationService;
import commerce.entities.concretes.User;

public class MicrosoftApiManager implements AuthenticationService {

	@Override
	public Boolean authentication(User user) {
		Boolean isAuth=Boolean.FALSE;
		if (!(user.getAuthenticationId().isEmpty())) {
			isAuth=Boolean.TRUE;
			System.out.println("Oturum açma Microsoft ile Başarılı");
		}else {
			isAuth=Boolean.FALSE;
			System.out.println("Oturum açma başarısızdır.");
		}
		
		return isAuth;
	}

}
