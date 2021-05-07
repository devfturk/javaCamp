package nLayeredeCommerceSimulation.business.abstracts;

import nLayeredeCommerceSimulation.entities.concretes.User;
import java.util.List;
public interface UserService {
	void add(User user);
	void remove(User user);
	void update(User user);
	void verifyUser(int id);
	User get(int id);
	User getByEmail(String email);
	User getByEmailAndPassword(String email,String password);
	List<User> getAll();
}