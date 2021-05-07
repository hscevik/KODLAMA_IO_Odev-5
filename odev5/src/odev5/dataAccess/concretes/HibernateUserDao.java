package odev5.dataAccess.concretes;

import java.util.List;

import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı Eklendi. Aktif edilmedi."+user.getFirstName()+" "+user.getLastName());		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi."+user.getFirstName()+" "+user.getLastName());		
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı silindi."+user.getFirstName()+" "+user.getLastName());		
		
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
	public void active(User user) {
		user.setUserActive(true);
		System.out.println("Kullanıcı Aktif edildi.");		
	}

}


