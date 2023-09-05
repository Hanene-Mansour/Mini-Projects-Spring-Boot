package projet.spring.service;

import java.util.List;

import projet.spring.entities.User;

public interface UserService {

	User AjouterUser(User u);
	void DeleteUser(User u);
	void DeleteUser(Long id);
	List<User> getAllUser();
		
}
