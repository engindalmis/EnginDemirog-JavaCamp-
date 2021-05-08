package commerce.business.abstracts;

import commerce.entities.concretes.User;

public interface AuthService {
	
	public void register(User user);


	public void login(User user);

}
