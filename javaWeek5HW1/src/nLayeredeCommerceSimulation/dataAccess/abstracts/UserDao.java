package nLayeredeCommerceSimulation.dataAccess.abstracts;

import java.util.List;

import nLayeredeCommerceSimulation.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void remove(User user);
	void update(User user);
	User get(int id);
	User getByEmail(String email);
	User geyByEmailandPassword(String email,String password);
	List<User> getAll();
}
