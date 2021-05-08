package commerce.business.concretes;

import commerce.business.abstracts.AuthService;
import commerce.business.abstracts.UserService;
import commerce.entities.concretes.User;

public class AuthManager implements AuthService {
	
	private UserService userService;
	

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		userService.add(user);
		
	}



	@Override
	public void login(User user) {
		userService.login(user);
	}

}
