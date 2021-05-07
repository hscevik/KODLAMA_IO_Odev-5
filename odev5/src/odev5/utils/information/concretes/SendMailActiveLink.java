package odev5.utils.information.concretes;


import odev5.entities.concretes.User;
import odev5.utils.information.abstracts.Information;

public class SendMailActiveLink implements Information{

	@Override
	public void userInformation(User user) {
		// TODO Auto-generated method stub
		
		
		System.out.println(user.getMail()+" Doðrulama Kodu Gönderildi :"+12341234);
	}

}
