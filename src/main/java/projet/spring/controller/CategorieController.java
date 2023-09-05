package projet.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projet.spring.entities.Categorie;
import projet.spring.service.CategorieService;

@RestController
public class CategorieController {
	@Autowired
	CategorieService ServiceCat;
	
	@GetMapping("/Categories")
	@ResponseBody
	public List<Categorie> getAllCategories(){
		List<Categorie>  list= ServiceCat.getAllCategorie();
		return list ;
	}
	
	@PostMapping("/AjouterCategorie")
	@ResponseBody
	public Categorie AjouterCategorie(@RequestBody Categorie c) {
		return ServiceCat.AjouterCategorie(c);
	}
	
	@DeleteMapping("/Delete/{id}")
	@ResponseBody
	public void DeleteCategorie(@PathVariable("id") Integer id) {
		ServiceCat.DeleteCategorie(id);
	}
	
	
	@DeleteMapping("/Delete")
	@ResponseBody
	public void DeleteCategorie(@RequestBody Categorie c) {
		ServiceCat.DeleteCategorie(c);
	}
	
	@PutMapping("/AffecterArticleACategorie/{idArticle}/{idCategorie}")
	@ResponseBody
	public void AffecterArticleACategorie(@PathVariable("idArticle") int idArticle, @PathVariable("idCategorie") int idCategorie) {
		ServiceCat.AffecterArticleACategorie(idArticle,idCategorie);
	}
}
