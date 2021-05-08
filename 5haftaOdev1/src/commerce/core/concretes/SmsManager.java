package commerce.core.concretes;

import commerce.core.abstracts.VerificationService;
import commerce.entities.concretes.User;

public class SmsManager implements VerificationService{

	@Override
	public Boolean sending(User user) {
		System.out.println("sms gönderildi");
		return true;
	}

	@Override
	public String verificationKey() {
		return "ABC";
	}

}
