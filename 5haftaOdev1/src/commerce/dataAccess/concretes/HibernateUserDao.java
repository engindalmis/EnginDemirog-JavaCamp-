package commerce.dataAccess.concretes;


import commerce.dataAccess.abstracts.UserDao;
import commerce.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	//Veriye Erişim Kodlarımızı Yazacağız.
	//implaments edip soyutlarız.
	
	
	@Override
	public void add(User user) {
		
		System.out.println("Hibernate ile eklendi. "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}





}
