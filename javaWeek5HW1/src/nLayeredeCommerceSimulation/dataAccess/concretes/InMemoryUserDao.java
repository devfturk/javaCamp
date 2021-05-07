package nLayeredeCommerceSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredeCommerceSimulation.dataAccess.abstracts.UserDao;
import nLayeredeCommerceSimulation.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users = new ArrayList<User>();
	

	@Override
	public void add(User user) {
		this.users.add(user);
		
	}

	@Override
	public void remove(User user) {
		this.users.remove(user);
		
	}

	@Override
	public void update(User user) {
		this.users.set(this.users.indexOf(user), user);
		
	}

	@Override
	public User get(int id) {
		for(User user : this.users) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for(User user : this.users) {
			if(user.getEmail() == email)
				return user;
		}
		return null;
	}

	@Override
	public User geyByEmailandPassword(String email, String password) {
		for(User user : this.users) {
			if(user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}
	
}
