package commerce;


import commerce.business.abstracts.AuthService;
import commerce.business.abstracts.UserService;
import commerce.business.concretes.AuthManager;
import commerce.business.concretes.UserManager;
import commerce.core.concretes.EmailControllerManager;
import commerce.core.concretes.EmailManager;
import commerce.dataAccess.concretes.HibernateUserDao;
import commerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService=new UserManager(new HibernateUserDao(),new EmailControllerManager(),new EmailManager(),null);
		User user1=new User(1, "Engin", "Dalmış", "engindalmis26@hotmail.com", "1234567","ABCd","123");
//		User user2=new User(2, "Mehmet", "Erbil", "mehmeterbil@hotmail.com", "1234567","ABC","1234");
//		userService.add(user1);
//		ArrayList<User> users =new ArrayList<User>();
//		users.add(user1);
//		users.add(user2);
//		userService.getAll(users);
		
		AuthService authService=new AuthManager(userService);
		authService.login(user1);
		authService.register(user1);
		
 
	}

}
