package odev5.utils.information.concretes;

import odev5.entities.concretes.User;
import odev5.utils.information.abstracts.Information;

public class MailÝnformation implements Information{

	@Override
	public void userInformation(User user) {
    System.out.println(user.getFirstName()+" "+user.getLastName()+" Kayýt baþarýlý."+user.getMail()+" adresinize bildirim yapýldý.");		
	}

}
