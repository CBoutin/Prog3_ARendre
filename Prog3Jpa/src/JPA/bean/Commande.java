package JPA.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Commande")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "idUser")
	private String idUser;

	@Column(name = "codeArticle")
	private String codeArticle;

	@Column(name = "date")
	private Date date;
	
	public Commande(){}

	public Commande(String idUser, String codeArticle, Date date) {
		super();
		this.idUser = idUser;
		this.codeArticle = codeArticle;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", idUser=" + idUser + ", codeArticle="
				+ codeArticle + ", date=" + date + "]";
	}
	
	

	

}
