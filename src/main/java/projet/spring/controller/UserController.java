package projet.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projet.spring.entities.User;
import projet.spring.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/Users")
	@ResponseBody
	public List<User> getAllUsers(){
		List<User> list= userService.getAllUser();
		return list ;	
	}
	
	@PostMapping("/AjouterUser")
	@ResponseBody
	public User AjouterUser(@RequestBody User u) {
		return userService.AjouterUser(u);
	}
	
	@DeleteMapping("deleteUser/{id}")
	@ResponseBody
	public void deleteUser(@PathVariable("id") Long idUser) {
		userService.DeleteUser(idUser);
	}

}
