package commerce.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import commerce.core.abstracts.EmailService;
import commerce.entities.concretes.User;

public class EmailControllerManager  implements EmailService{

	@Override
	public Boolean isUsedEmail(User user) {
		Boolean isUsed=Boolean.FALSE;
		//Veri tabanın veri getirip kontrol edemediğimiz için şimdilik
		//iki tane string email alanı static oluşturup gelen veriyle kontrol edeceğiz.
		//static email alanlarını veri tabanından gelmiş gibi sanacağız
		 String email1="engindalmis26@gmail.com";
		 String email2="engindalmis@gmail.com";
		
		if (user.getEmail().equals(email1) || user.getEmail().equals(email2)) {
			isUsed=Boolean.TRUE;
			System.out.println("Bu email adresi sisteme kayıtlıdır.Lütfen başka bit email giriniz.");
		}else {
			isUsed=Boolean.FALSE;
		}
		return isUsed;
	}

	@Override
	public Boolean emailFormatControl(User user) {
		Boolean emailControl=Boolean.FALSE;
		//Email regex
		String regex = "^(.+)@(.+)$";
		//Büyük küçük harf duyarlılığı kaldırıldı
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(user.getEmail());
		if(matcher.matches()) {
			System.out.println("Email geçerli");
			emailControl=Boolean.TRUE;
			}else {
				emailControl=Boolean.FALSE;
				System.out.println("Lütfen geçerli bir email adresi giriniz.");
			}
		
		return emailControl;
	}

}
