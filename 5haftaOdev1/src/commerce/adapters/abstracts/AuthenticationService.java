package commerce.adapters.abstracts;

import commerce.entities.concretes.User;

public interface AuthenticationService {
	
	public Boolean authentication(User user);

}
