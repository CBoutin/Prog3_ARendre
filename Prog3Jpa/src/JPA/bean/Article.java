package JPA.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Article")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "Code")
	private String Code;
	
	@Column(name = "Nom")
	private String Nom;
	
	@Column(name = "Prix")
	private Double Prix;
	
	@Column(name = "Stock")
	private int Stock;

	//constructeur
	public Article(String code, String nom, Double prix, int stock) {
		Code = code;
		Nom = nom;
		Prix = prix;
		Stock = stock;
	}

	public Article() {
		// TODO Auto-generated constructor stub
	}

	//getter & setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public Double getPrix() {
		return Prix;
	}

	public void setPrix(Double prix) {
		Prix = prix;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	@Override
	public String toString() {
		return "Article [Code=" + Code + ", Nom=" + Nom + ", Prix=" + Prix
				+ ", Stock=" + Stock + "]";
	}

}
