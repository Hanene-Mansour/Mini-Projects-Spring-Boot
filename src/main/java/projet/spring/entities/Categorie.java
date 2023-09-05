package projet.spring.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String libelleCategorie;
	
	@OneToMany(mappedBy = "categorie")
	private List<Article> article;
	
	
	
	public List<Article> getArticle() {
		return article;
	}
	public void setArticle(List<Article> article) {
		this.article = article;
	}
	public Categorie() {
		super();
	}
	public Categorie(int id, String libelleCategorie) {
		super();
		this.id = id;
		this.libelleCategorie = libelleCategorie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelleCategorie() {
		return libelleCategorie;
	}
	public void setLibelleCategorie(String libelleCategorie) {
		this.libelleCategorie = libelleCategorie;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", libelleCategorie=" + libelleCategorie + "]";
	}
	
	
	
	
	
	
}
