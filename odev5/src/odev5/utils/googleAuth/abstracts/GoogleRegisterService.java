package odev5.utils.googleAuth.abstracts;

import odev5.entities.concretes.User;

public interface GoogleRegisterService {
	User user(String mail,String password);
}
