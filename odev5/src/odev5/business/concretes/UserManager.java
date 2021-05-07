package odev5.business.concretes;

import java.util.List;
import odev5.business.abstracts.UserService;
import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;
import odev5.utils.information.abstracts.Information;
import odev5.utils.information.concretes.MailÝnformation;
import odev5.utils.information.concretes.SendMailActiveLink;
import odev5.utils.regex.abstracts.Reg;
import odev5.utils.regex.concretes.ValidValueFirstName;
import odev5.utils.regex.concretes.ValidValueLastName;
import odev5.utils.regex.concretes.ValidValueMail;
import odev5.utils.regex.concretes.ValidValuePassword;

public class UserManager implements UserService {

UserDao userDao;
	public UserManager(UserDao userDao) {
	super();
	this.userDao = userDao;
}

	@Override
	public void add(User user) {
		
		Information mailIinformation=new MailÝnformation();
		Information sendMailActiveLink=new SendMailActiveLink();

		if(chekUser(user))
		{
		userDao.add(user);	
		sendMailActiveLink.userInformation(user);
		if(verificationCode(12341234))
		{
			active(user);
			mailIinformation.userInformation(user);

		}

		}
	
	
	}

	@Override
	public void update(User user) {
		userDao.update(user);		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public boolean chekUser(User user) {
		Reg regPass=new ValidValuePassword();
		Reg reg=new ValidValueMail();	
		Reg regFirstName=new ValidValueFirstName();
		Reg regLastName=new ValidValueLastName();

		if (reg.isItValidValue(user.getMail())&&regPass.isItValidValue(user.getPassword())&&regFirstName.isItValidValue(user.getFirstName())&&regLastName.isItValidValue(user.getLastName()) ){
			
			if(user.getMail()=="abc@hotmail.com")
			{
				System.out.println("Mail sistemde  zaten var.");
				return false;
			}
			else {
				
				System.out.println("Mail sistemde kayýtlý deðil geçerli.");
				return true;
				}
			
			
		}
		else {
			
			return false;
		}
		
		
		
		
		
	}

	@Override
	public boolean verificationCode(int code) {
		if(code==12341234) {
			
			return true;	
			
		}
		else {
			
			return false;
		}
	}

	@Override
	public void active(User user) {
		
		userDao.active(user);
	}

	@Override
	public void login(String userName, String password) {
		if(userName!=null || password!=null) {
			if(userName=="hscevik"&&password=="123456") {
				
				System.out.println("Sisteme baþarýlý giriþ yapýldý..");
				
			}
			
		}
		else {
			
			System.out.println("Kullanýcý adý veya þifre boþ olamaz..");
		}
		
	}




}
