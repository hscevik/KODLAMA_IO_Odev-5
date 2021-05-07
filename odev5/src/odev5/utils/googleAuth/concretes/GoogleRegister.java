package odev5.utils.googleAuth.concretes;

import odev5.entities.concretes.User;
import odev5.outServices.googleAuth.GRegister;
import odev5.outServices.googleAuth.GUser;
import odev5.utils.googleAuth.abstracts.GoogleRegisterService;

public class GoogleRegister implements  GoogleRegisterService{

	@Override
	public User user(String mail,String password) {
		GRegister gr=new GRegister();
		 
		GUser gUser=	gr.ReturnGUser(mail, password);
		User user=new User();
		
		user.setAdress(gUser.getAdress());
		user.setFirstName(gUser.getFirstName());
		user.setLastName(gUser.getLastName());
		user.setMail(gUser.getMail());
		user.setPassword(gUser.getPassword());
		user.setPhone(gUser.getPhone());
		user.setUserName(gUser.getUserName());
		return user ;
	}

}
