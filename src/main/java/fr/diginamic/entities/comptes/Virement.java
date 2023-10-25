package fr.diginamic.entities.comptes;

import javax.persistence.Entity;

import fr.diginamic.entities.Operation;

@Entity
public class Virement extends Operation{
	String beneficiaire;

	/** Constructeur
	 * 
	 */
	public Virement() {
		super();
	}

	/** Getter
	 * @return the beneficiaire
	 */
	public String getBeneficaire() {
		return beneficiaire;
	}

	/** Setter 
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	
	
	
}
