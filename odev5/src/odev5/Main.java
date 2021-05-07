package odev5;

import odev5.business.abstracts.UserService;
import odev5.business.concretes.UserManager;
import odev5.dataAccess.concretes.HibernateUserDao;
import odev5.entities.concretes.User;
import odev5.utils.googleAuth.concretes.GoogleRegister;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService userService=new UserManager(new HibernateUserDao());
		
		System.out.println("Normal Kayýt");
		System.out.println("------------------");
		User user1=new User(1,"Harun Sertaç","Çevik","hscevik@hotmail.com","5322223344","Ankara","hscevik","123456");
		userService.add(user1);
		
		
		System.out.println("\n\n");
		
		
		System.out.println("Google Kayýt");
		System.out.println("------------------");
		User user2=new GoogleRegister().user("hscevik@gmail.com", "123456");
		userService.add(user2);
		
		System.out.println("\n\n");
		
		
		System.out.println("Sisteme giriþ");
		System.out.println("------------------");

		userService.login("hscevik", "123456");
	}

}
