package projet.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.spring.entities.Article;
import projet.spring.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleRepository repArticle;
	
	@Override
	public Article AjouterArticle(Article a) {
		repArticle.save(a);
		return a;
	}

	@Override
	public void DeleteArticle(Article a) {
		repArticle.delete(a);
	}

	@Override
	public void DeleteArticle(int id) {
		repArticle.deleteById(id);
	}

	@Override
	public List<Article> getAllArticle() {
		return  (List<Article>) repArticle.findAll();
	}

}
