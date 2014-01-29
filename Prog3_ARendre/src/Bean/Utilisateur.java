package Bean;

public class Utilisateur {

	private int Identifiant;
	private String Mot_de_passe;
	private String Nom_de_famille;
	private String Prenom;
	private String Adresse;
	private int Code_postale;
	private String Liste_Pays;

	public Utilisateur(int identifiant, String mot_de_passe,
			String nom_de_famille, String prenom, String adresse,
			int code_postale, String liste_Pays) {
		Identifiant = identifiant;
		Mot_de_passe = mot_de_passe;
		Nom_de_famille = nom_de_famille;
		Prenom = prenom;
		Adresse = adresse;
		Code_postale = code_postale;
		Liste_Pays = liste_Pays;
	}

	public void setListe_Pays(String liste_Pays) {
		Liste_Pays = liste_Pays;
	}

	public int getIdentifiant() {
		return Identifiant;
	}

	public void setIdentifiant(int identifiant) {
		Identifiant = identifiant;
	}

	public String getMot_de_passe() {
		return Mot_de_passe;
	}

	public void setMot_de_passe(String mot_de_passe) {
		Mot_de_passe = mot_de_passe;
	}

	public String getNom_de_famille() {
		return Nom_de_famille;
	}

	public void setNom_de_famille(String nom_de_famille) {
		Nom_de_famille = nom_de_famille;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public int getCode_postale() {
		return Code_postale;
	}

	public void setCode_postale(int code_postale) {
		Code_postale = code_postale;
	}

	@Override
	public String toString() {
		return "Utilisateur [Identifiant=" + Identifiant + ", Mot_de_passe="
				+ Mot_de_passe + ", Nom_de_famille=" + Nom_de_famille
				+ ", Prenom=" + Prenom + ", Adresse=" + Adresse
				+ ", Code_postale=" + Code_postale + ", Liste_Pays="
				+ Liste_Pays + "]";
	}

}
