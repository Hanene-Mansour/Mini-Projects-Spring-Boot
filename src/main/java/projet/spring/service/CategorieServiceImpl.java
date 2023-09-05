package projet.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet.spring.entities.Article;
import projet.spring.entities.Categorie;
import projet.spring.repository.ArticleRepository;
import projet.spring.repository.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService{

	@Autowired
	CategorieRepository RepCat;
	@Autowired
	ArticleRepository RepArt;
	
	@Override
	public Categorie AjouterCategorie(Categorie c) {
		RepCat.save(c);
		return c;
	}

	@Override
	public void DeleteCategorie(Categorie c) {
		RepCat.delete(c);	
	}

	@Override
	public void DeleteCategorie(Integer id) {
		RepCat.deleteById(id);
	}

	@Override
	public List<Categorie> getAllCategorie() {
		return (List<Categorie>) RepCat.findAll();
	}

	@Override
	public void AffecterArticleACategorie(Integer idArticle, Integer idCategorie) {
		
		Categorie  categorieEntity = RepCat.findById(idCategorie).get();
		Article articleEntity = RepArt.findById(idArticle).get();
		articleEntity.setCategorie(categorieEntity);
		RepArt.save(articleEntity);
	}

}
