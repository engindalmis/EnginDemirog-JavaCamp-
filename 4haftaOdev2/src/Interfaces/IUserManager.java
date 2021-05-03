package Interfaces;

import Entities.User;

public interface IUserManager {

	public void registerUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(User user);
}
