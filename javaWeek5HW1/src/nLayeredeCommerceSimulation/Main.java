package nLayeredeCommerceSimulation;

import nLayeredeCommerceSimulation.business.abstracts.UserService;
import nLayeredeCommerceSimulation.business.concretes.AuthManager;
import nLayeredeCommerceSimulation.business.concretes.EmailManager;
import nLayeredeCommerceSimulation.business.concretes.UserManager;
import nLayeredeCommerceSimulation.business.concretes.UserValidationManager;
import nLayeredeCommerceSimulation.core.AuthService;
import nLayeredeCommerceSimulation.core.GoogleAuthManagerAdapter;
import nLayeredeCommerceSimulation.dataAccess.concretes.InMemoryUserDao;

public class Main {

	public static void main(String[] args) {
		
		
		UserService userService = new UserManager(new InMemoryUserDao());
		AuthService authService = new AuthManager(userService, new UserValidationManager(), new EmailManager());
		authService.register(1, "example@example.com", "1234567", "Furkan", "Türk"); // Baþarýlý
		authService.register(2, "noeposta", "sifre", "furkan", "Türk"); // Baþarýsýz eposta invalid
		authService.register(3, "example1@example.com", "12", "Furkan", "Türk"); // Baþarýsýz þifre invalid
		authService.register(4, "example1@example.com", "34", "f", "türk"); // Baþarýsýz ad-soyad invalid
		authService.register(5, "example@example.com", "44444444", "Furkan", "Türk"); // Baþarýsýz e-posta mevcut


		authService.login("example@example.com", "1234567"); // Baþarþsþz üye doðrulama yapmamýþ.
		userService.verifyUser(1); // Kullanþcþyþ doþrulayalþm.
		authService.login("example@example.com", "123123"); // Baþarýsýz þifre yanlýþ.
		authService.login("example@example.com", "1234567"); // baþarýlý.
		authService.login("", ""); // Baþarþsþz e-posta parola zorunlu
		
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		googleAuthService.register(6, "fturk@gmail.com", "1234567", "Furkan", "TÜRK");
		googleAuthService.login("fturk@gmail.com", "1234567");
		
		
	}

}
