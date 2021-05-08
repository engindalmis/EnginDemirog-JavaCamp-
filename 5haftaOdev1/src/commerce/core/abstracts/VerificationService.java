package commerce.core.abstracts;

import commerce.entities.concretes.User;

public interface VerificationService {
	
	//Üyelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir.
	public Boolean sending(User user);
	//Doğrulama linki tıklandığında üyelik tamamlanmalıdır.
	public String verificationKey();

}
