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

public class serviceLogin {

	protected EntityManager em;

	public serviceLogin() {
	}

	public Utilisateur findUtilisateur(String Id_user) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded.");
		String url = "jdbc:mysql://localhost/Bddprog3";

		Connection conn = DriverManager.getConnection(url, "root", "");
		System.out.println("Got Connection.");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM BDDProg3.utilisateur where Id_user = '" + Id_user + "'");
		ResultSetMetaData metadata = rs.getMetaData();
		ArrayList<Object> current = new ArrayList<>();
		Utilisateur user = new Utilisateur();
		while (rs.next()) {
//			ArrayList<Object> utilisateur = new ArrayList<>();
			for (int i = 0; i < metadata.getColumnCount(); i++) {
				Object value = rs.getObject(i + 1);
				if (value == null) {
					System.out.print("\t       ");
				} else {
					current.add(value.toString().trim());
				}
			}
			user.setId_user((String) current.get(3));
			user.setMdp((String) current.get(7));
		}
		return user;

	}
}
