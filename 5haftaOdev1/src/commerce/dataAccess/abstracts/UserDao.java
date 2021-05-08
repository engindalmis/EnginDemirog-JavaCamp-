package commerce.dataAccess.abstracts;


import commerce.entities.concretes.User;

public interface UserDao {
	//Kullanıcı Ekleme-Güncelleme-Silme
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	//İd'sini verdiğimiz kullanıcıyı getirecek
	User get(int id);
	
	

}
