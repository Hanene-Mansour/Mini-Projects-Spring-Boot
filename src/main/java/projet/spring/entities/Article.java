package projet.spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Article {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String libelle;
	private int quantite;
	private float prix;
	
	@ManyToOne
	private Categorie categorie;
	
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public Article() {
		super();
	}
	public Article(int id, String libelle, int quantite, float prix) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.quantite = quantite;
		this.prix = prix;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Article [id=" + id + ", libelle=" + libelle + ", quantite=" + quantite + ", prix=" + prix + "]";
	}
	
	
	
	

}
