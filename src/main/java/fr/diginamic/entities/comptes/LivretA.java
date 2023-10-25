package fr.diginamic.entities.comptes;

import javax.persistence.Entity;

import fr.diginamic.entities.Compte;

@Entity
public class LivretA extends Compte{
	Double taux;

	/** Constructeur
	 * 
	 */
	public LivretA() {
	}

	/** Getter
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}

	/** Setter
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
	
}
