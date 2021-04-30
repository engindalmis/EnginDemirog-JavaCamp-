
public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFistName()+" "+user.getFistName()+" isimli kullanıcı sisteme eklenmiştir.");
	}
	public void deleteUser(User user) {
		System.out.println(user.getId()+" idili kullanıcı sistemden silinmiştir.");
	}
	public void updateUser(User user) {
		System.out.println(user.getFistName()+" "+user.getFistName()+" isimli kullanıcı güncellenmiştir.");
	}
}
