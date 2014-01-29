package Bean;

public class Article {

	private String Code;
	private String Nom;
	private Double Prix;
	private int Stock;

	public Article(String code, String nom, Double prix, int stock) {
		Code = code;
		Nom = nom;
		Prix = prix;
		Stock = stock;
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
