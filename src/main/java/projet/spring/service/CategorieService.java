package projet.spring.service;

import java.util.List;

import projet.spring.entities.Categorie;

public interface CategorieService {

	Categorie AjouterCategorie(Categorie c);
	void DeleteCategorie(Categorie c);
	void DeleteCategorie(Integer id);
	List<Categorie> getAllCategorie();
	
	public void AffecterArticleACategorie(Integer idArticle, Integer idCategorie);
}
