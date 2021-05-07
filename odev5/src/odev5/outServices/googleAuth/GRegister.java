package odev5.outServices.googleAuth;

public class GRegister {

	public GUser ReturnGUser(String mail,String password)
	{
		GUser gUser=new GUser();
		
		gUser.setFirstName("Harun"); 
		gUser.setLastName("Çevik"); 
		gUser.setMail(mail);
		gUser.setPhone("1234234"); 
		gUser.setAdress("Ýstanbul"); 
		gUser.setUserName("hscevik"); 
		gUser.setPassword(password); 
		
		return gUser;
		
	}
}
