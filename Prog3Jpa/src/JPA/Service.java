package JPA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.persistence.EntityManager;

import JPA.bean.Utilisateur;

public class Service {

	protected EntityManager em;

	public Service(EntityManager em) {
		this.em = em;
	}

	public Utilisateur createProfessor(int id, String adresse, int code_postal,
			String Id_user, String mdp, String nom, String pays, String prenom) {
		Utilisateur user = new Utilisateur(id);
		user.setAdresse(adresse);
		user.setCode_postal(code_postal);
		user.setId_user(Id_user);
		user.setMdp(mdp);
		user.setNom(nom);
		user.setPays(pays);
		user.setPrenom(prenom);
		em.persist(user);
		return user;
	}

	public ArrayList<Object> findAllUtilisateur() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded.");
		String url = "jdbc:mysql://localhost/demojpa";

		Connection conn = DriverManager.getConnection(url, "root", "");
		System.out.println("Got Connection.");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM demojpa.utilisateur");
		ResultSetMetaData metadata = rs.getMetaData();
		ArrayList<Object> Utilisateurs = new ArrayList<>();
		while (rs.next()) {
			ArrayList<Object> utilisateur = new ArrayList<>();
			for (int i = 0; i < metadata.getColumnCount(); i++) {
				Object value = rs.getObject(i + 1);
				if (value == null) {
					System.out.print("\t       ");
				} else {
					utilisateur.add(value.toString().trim());
				}
			}
			Utilisateurs.add(utilisateur);
		}
//
//		Query query = em.createQuery("SELECT e FROM demojpa.utilisateur e");
		return Utilisateurs;

	}
}
