package fr.diginamic.entities.comptes;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fr.diginamic.entities.Compte;

@Entity
public class AssuranceVie extends Compte {
    @Temporal(TemporalType.DATE)
	Date dateFin;
	Double taux;
	
	/** Constructeur
	 * 
	 */
	public AssuranceVie() {
	}

	/** Getter
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
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
