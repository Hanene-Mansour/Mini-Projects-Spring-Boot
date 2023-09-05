package projet.spring.entities;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String nom;
	private String prenom;
	private String adresse;
	private Integer  age ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	public String getAdresse()
	{
		return adresse;
	}
	public void setAdresse(String adresse) 
	{
		this.adresse = adresse;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", age=" + age + "]";
	}

	public User() {
		super();
	}
	public User(String nom, String prenom, String adresse, Integer age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
	}
	
	}
