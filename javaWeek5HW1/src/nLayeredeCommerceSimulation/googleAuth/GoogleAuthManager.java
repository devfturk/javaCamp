package nLayeredeCommerceSimulation.googleAuth;

public class GoogleAuthManager {
    public void register(String email,String password) {
   	 //Google kodlar�, geri d�n��ler vs ger�ek kodlara g�re ele al�nabilir. �imdilik her �artta kay�t al�nd� d�nd�relim.
   	 System.out.println("Google ile kay�t al�nd� :" + email);
    }
    public void login(String email,String password) {
   	 System.out.println("Google ile giri� yap�ld� : " + email);
    }
}
