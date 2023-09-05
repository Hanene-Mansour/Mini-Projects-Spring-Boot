package projet.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projet.spring.entities.Categorie;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Integer> {

}
