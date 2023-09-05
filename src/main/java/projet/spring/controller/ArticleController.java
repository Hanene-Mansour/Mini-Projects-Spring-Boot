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

import projet.spring.entities.Article;
import projet.spring.service.ArticleService;

@RestController
public class ArticleController {

	@Autowired
	ArticleService articleService;
	
	@GetMapping("/Articles")
	@ResponseBody
	public List<Article> getAllArticles(){
		List<Article> list = articleService.getAllArticle();
		return list ;
	}
	
	@PostMapping("/AjouterArticle")
	@ResponseBody
	public Article  AjouterArticle(@RequestBody Article a) {
		return articleService.AjouterArticle(a);
	}
	@DeleteMapping("/DeleteArticle/{id}")
	@ResponseBody
	public void DeleteArticle(@PathVariable("id") Integer idArticle) {
		articleService.DeleteArticle(idArticle);
	}
	
	@DeleteMapping("/DeleteArticle")
	@ResponseBody
	public void DeleteArticle(@RequestBody Article a) {
		articleService.DeleteArticle(a);;
	}
}
