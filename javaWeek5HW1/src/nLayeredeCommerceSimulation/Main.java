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
		authService.register(1, "example@example.com", "1234567", "Furkan", "T�rk"); // Ba�ar�l�
		authService.register(2, "noeposta", "sifre", "furkan", "T�rk"); // Ba�ar�s�z eposta invalid
		authService.register(3, "example1@example.com", "12", "Furkan", "T�rk"); // Ba�ar�s�z �ifre invalid
		authService.register(4, "example1@example.com", "34", "f", "t�rk"); // Ba�ar�s�z ad-soyad invalid
		authService.register(5, "example@example.com", "44444444", "Furkan", "T�rk"); // Ba�ar�s�z e-posta mevcut


		authService.login("example@example.com", "1234567"); // Ba�ar�s�z �ye do�rulama yapmam��.
		userService.verifyUser(1); // Kullan�c�y� do�rulayal�m.
		authService.login("example@example.com", "123123"); // Ba�ar�s�z �ifre yanl��.
		authService.login("example@example.com", "1234567"); // ba�ar�l�.
		authService.login("", ""); // Ba�ar�s�z e-posta parola zorunlu
		
		AuthService googleAuthService = new GoogleAuthManagerAdapter();
		googleAuthService.register(6, "fturk@gmail.com", "1234567", "Furkan", "T�RK");
		googleAuthService.login("fturk@gmail.com", "1234567");
		
		
	}

}
