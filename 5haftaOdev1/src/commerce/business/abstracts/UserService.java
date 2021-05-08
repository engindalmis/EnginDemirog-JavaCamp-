package commerce.business.abstracts;


import java.util.ArrayList;

import commerce.entities.concretes.User;

public interface UserService {
	//Service görürsek bu iş sınıfının interfacedir.
	//Ekleme
	public void add(User user) ;
	
	
	/*Sisteme temel kullanıcı bilgileri ,
	 *  e-posta ve parolayla üye olunabilmelidir. 
	 * Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.
	 * */
	public Boolean requiredSpaceControl(User user);
	//Parola en az 6 karakterden oluşmalıdır.
	public Boolean passwordLengthControl(User user);
	
	//Ad ve soyad en az iki karakterden oluşmalıdır.
	public Boolean nameLengthControl(User user);

	public void getAll(ArrayList<User> users);
	
	
	public void login(User user);
	

}
