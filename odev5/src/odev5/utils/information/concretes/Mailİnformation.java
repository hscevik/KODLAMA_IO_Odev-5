package odev5.utils.information.concretes;

import odev5.entities.concretes.User;
import odev5.utils.information.abstracts.Information;

public class Mail�nformation implements Information{

	@Override
	public void userInformation(User user) {
    System.out.println(user.getFirstName()+" "+user.getLastName()+" Kay�t ba�ar�l�."+user.getMail()+" adresinize bildirim yap�ld�.");		
	}

}
