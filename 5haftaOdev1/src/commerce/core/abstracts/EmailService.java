package commerce.core.abstracts;

import commerce.entities.concretes.User;

public interface EmailService {
	//E-Posta daha önce kullanılmamış olmalıdır.
	public Boolean isUsedEmail(User user);
	//E-posta alanı e-posta formatında olmalıdır. (Regex ile yapınız. Araştırma konusu)
	public Boolean emailFormatControl(User user);

}
