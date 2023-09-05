package projet.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projet.spring.entities.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer>{

}
