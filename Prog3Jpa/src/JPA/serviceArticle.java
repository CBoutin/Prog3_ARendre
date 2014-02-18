package JPA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.persistence.EntityManager;

import JPA.bean.Article;

public class serviceArticle {
	ArrayList<Article> articles= new ArrayList<>();
	protected EntityManager em;

	public serviceArticle() {
	}

	public ArrayList<Article> findArticles() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded.");
		String url = "jdbc:mysql://localhost/Bddprog3";

		Connection conn = DriverManager.getConnection(url, "root", "");
		System.out.println("Got Connection.");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM BDDProg3.article");
		ResultSetMetaData metadata = rs.getMetaData();
		
		
		while (rs.next()) {
			ArrayList<Object> current = new ArrayList<>();
			Article article = new Article();
			for (int i = 0; i < metadata.getColumnCount(); i++) {
				Object value = rs.getObject(i + 1);
				if (value == null) {
					System.out.print("\t       ");
				} else {
					current.add(value.toString().trim());
				}
			}
			article.setCode((String) current.get(1));
			article.setNom((String) current.get(2));
			article.setPrix(Double.parseDouble((String) current.get(3)));
			article.setStock(Integer.parseInt((String) current.get(4)));
			articles.add(article);
		}

		return articles;

	}
	
	public Article getArticle(String code)
	{
		try {
			for(Article a : findArticles())
			{
				if(a.getCode().compareTo(code) == 0) return a;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
