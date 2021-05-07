package odev5.business.abstracts;

import java.util.List;

import odev5.entities.concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	void active(User user);
	void login(String userName,String password);
	boolean chekUser(User user);
	boolean verificationCode(int code);
	User get(int id);
	List<User>getAll();

}
