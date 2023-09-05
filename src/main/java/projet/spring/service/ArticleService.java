package projet.spring.service;

import java.util.List;

import projet.spring.entities.Article;

public interface ArticleService {

	Article AjouterArticle(Article a);
	void DeleteArticle(Article a);
	void DeleteArticle(int id);
	List<Article> getAllArticle();
	
}
