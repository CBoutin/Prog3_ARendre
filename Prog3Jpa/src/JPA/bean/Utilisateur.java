package JPA.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "Id_user")
	private String Id_user;

	@Column(name = "mdp")
	private String mdp;

	@Column(name = "Nom")
	private String Nom;

	@Column(name = "Prenom")
	private String Prenom;

	@Column(name = "Adresse")
	private String Adresse;
	
	@Column(name = "Code_postal")
	private int Code_postal;
	
	@Column(name = "Pays")
	private String Pays;

	
	//getter & setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getId_user() {
		return Id_user;
	}

	public void setId_user(String id_user) {
		Id_user = id_user;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
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

	public int getCode_postal() {
		return Code_postal;
	}

	public void setCode_postal(int code_postal) {
		Code_postal = code_postal;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	
	//constructeur
	public Utilisateur(String id_user, String mdp, String nom, String prenom,
			String adresse, int code_postal, String pays) {
		super();
		Id_user = id_user;
		this.mdp = mdp;
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Code_postal = code_postal;
		Pays = pays;
	}

	public Utilisateur(int id){
		this.id = id;
	}

	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Utilisateur [Id_user=" + Id_user + ", mdp=" + mdp + ", Nom="
				+ Nom + ", Prenom=" + Prenom + ", Adresse=" + Adresse
				+ ", Code_postal=" + Code_postal + ", Pays=" + Pays + "]";
	}	
	
	

}