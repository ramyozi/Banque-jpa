package fr.diginamic;

import java.util.Date;

import javax.persistence.*;

import fr.diginamic.entities.*;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("banque-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

        try {
            Banque banque = new Banque();
            banque.setNom("MaBanque");
            em.persist(banque);

            Client client = new Client();
            client.setNom("Doe");
            client.setPrenom("John");
            client.setDateNaissance(new Date());

            Adresse adresse = new Adresse();
            adresse.setNumero(123);
            adresse.setRue("Rue de la Paix");
            adresse.setCodePostal(75001);
            adresse.setVille("Paris");

            client.setAdresse(adresse);
            client.setBanque(banque);

            em.persist(client);

            Compte compte = new Compte();
            compte.setNumero("12345");
            compte.setSolde(1000.0);
            em.persist(compte);

            Operation operation = new Operation();
            operation.setDateOperation(new Date());
            operation.setMontant(50.0);
            operation.setMotif("Deposit");
            operation.setCompte(compte);
            em.persist(operation);

            et.commit();
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
