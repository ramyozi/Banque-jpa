package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque-jpa");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        et.begin();
	        
	        et.commit();

	}

}
