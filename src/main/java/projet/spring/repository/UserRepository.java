package projet.spring.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projet.spring.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	
}
