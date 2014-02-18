package JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import JPA.bean.Commande;

public class ServiceCommande {
	protected EntityManager em;

	public ServiceCommande() {
	}

	public void EnregistrerCommande(Commande c) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Prog3Jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(c);
		tx.commit();
		em.close();
		emf.close();

	}
}