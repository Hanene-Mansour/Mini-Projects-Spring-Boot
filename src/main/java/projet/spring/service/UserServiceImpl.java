package projet.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.spring.entities.User;
import projet.spring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository RepUser ;
	
	@Override
	public User AjouterUser(User u) {
		RepUser.save(u);
		return u;
	}

	@Override
	public void DeleteUser(User u) {
		RepUser.delete(u);
	}

	@Override
	public void DeleteUser(Long id) {
		RepUser.deleteById(id);;
	}

	@Override
	public List<User> getAllUser() {
		return  (List<User>) RepUser.findAll();
	
	}

}
