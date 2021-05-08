package commerce.business.concretes;

import java.util.ArrayList;

import commerce.adapters.abstracts.AuthenticationService;
import commerce.business.abstracts.UserService;
import commerce.core.abstracts.EmailService;
import commerce.core.abstracts.VerificationService;
import commerce.dataAccess.abstracts.UserDao;
import commerce.entities.concretes.User;

public class UserManager implements UserService {
	// İş kodları yazılır.
	// örneğin Kullanıcı varmı (if else yapılır.)
	// Bağımlı olmamak için userdao ya dependency incection yapıyoruz.
	// Hibernate direk bağımlı olmak istemiyoruz.

	private UserDao userDao;
	private EmailService emailService;
	private VerificationService verificationService;
	private AuthenticationService authenticationService;

	public UserManager(UserDao userDao, EmailService emailService, VerificationService verificationService,
			AuthenticationService authenticationService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
		this.verificationService = verificationService;
		this.authenticationService = authenticationService;
	}

	@Override
	public void add(User user) {
		if (authenticationService == null) {
			if ((requiredSpaceControl(user))) {
				if (passwordLengthControl(user)) {
					if (emailService.emailFormatControl(user)) {
						if (!(emailService.isUsedEmail(user))) {
							this.verificationService.sending(user);
							if (verificationService.verificationKey().equals(user.getVerificationNumber())) {
								// Doğrulama yapıldığı set ediliyor.
								user.setStatus(true);
								// Veri tabanına ekleniyor.
								this.userDao.add(user);

								return;
							} else {
								System.out.println("Doğrulama işlemi başarısız olduğundan kullanıcı kaydedilemedi.");
							}

						}
					}
				}
			}
		} else if (authenticationService.authentication(user)) {
			
		}
	}

	@Override
	public Boolean requiredSpaceControl(User user) {
		Boolean requiredControl = Boolean.FALSE;
		if (!(user.getFirstName().isEmpty())
				&& !(user.getLastName().isEmpty() && !(user.getEmail().isBlank()) && !(user.getPassword().isEmpty()))) {
			requiredControl = Boolean.TRUE;
		} else {
			requiredControl = Boolean.FALSE;
		}
		//
		return requiredControl;
	}

	@Override
	public Boolean passwordLengthControl(User user) {
		Boolean passwordControl = Boolean.FALSE;
		if (user.getPassword().length() > 6) {
			passwordControl = Boolean.TRUE;
			System.out.println("Password Uzunluğu Yeterli Düzeydedir.");
		} else {
			passwordControl = Boolean.FALSE;
			System.out.println("Password boyutu 6 dan büyük olmalıdır.");

		}

		return passwordControl;
	}

	@Override
	public Boolean nameLengthControl(User user) {
		Boolean nameControl = Boolean.FALSE;
		if (user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			nameControl = Boolean.TRUE;
			System.out.println("Kullanıcı adı ve Soy ismi yeterli düzeydedir.");
		} else {
			nameControl = Boolean.TRUE;
			System.out.println("Lütfen adınızı veya soy adınızı 2 harften büyük olacak şekilde yazınız..");
		}
		return nameControl;
	}

	@Override
	public void getAll(ArrayList<User> users) {
		for (User users1 : users) {
			System.out.println("Kullanıcı listesi : " + users1.getFirstName());
		}

	}

	@Override
	public void login(User user) {
		if (!(user.getEmail().isEmpty())&& !(user.getPassword().isEmpty())) {
			//veritabanı olmadığından böyle kontrol ediliyor.
			if ((user.getEmail()=="engindalmis26@hotmail.com")&& (user.getPassword()=="1234") ) {
				System.out.println("Giriş işlemi başarılıdır.");
			}else {
				System.out.println("Lütfen tekrar deneyiniz.");
				
			}
				
		}else {
			System.out.println("Zorunlu alanlar boş geçilemez");
		}
	}
}
