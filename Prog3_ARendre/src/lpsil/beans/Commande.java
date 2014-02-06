package lpsil.beans;

public class Commande {

	private String Code;
	private String Nom;
	private Double Prix;

	public Commande(String code, String nom, Double prix) {
		Code = code;
		Nom = nom;
		Prix = prix;
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

	@Override
	public String toString() {
		return "Commande [Code=" + Code + ", Nom=" + Nom + ", Prix=" + Prix
				+ "]";
	}

}
