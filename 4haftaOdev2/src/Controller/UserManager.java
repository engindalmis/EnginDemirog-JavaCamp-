package Controller;

import Adapters.MernisAdapter;
import Entities.User;
import Interfaces.IUserManager;

public class UserManager implements IUserManager {

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanıcı Kaydı Yapılmıştır.");
		if (user.getCustomer() !=null) {
			MernisAdapter mernis=new MernisAdapter();
			mernis.CheckPersonIdentity(user);
			System.out.println("Şahıs Kaydı olduğundan Mernis Sorgulaması yapıldı.");
		}else {
			System.out.println("Mernis Sorgulaması yapılamadı");
		}
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
