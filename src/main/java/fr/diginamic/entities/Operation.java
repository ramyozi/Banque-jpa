package fr.diginamic.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Operation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	Date dateOperation;
	Double montant;
	String motif;

	@ManyToOne
	@JoinColumn(name = "compte_id")
	Compte compte;

	/**
	 * Constructeur
	 * 
	 */
	public Operation() {
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the dateOperation
	 */
	public Date getDateOperation() {
		return dateOperation;
	}

	/**
	 * Setter
	 * 
	 * @param dateOperation the dateOperation to set
	 */
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	/**
	 * Getter
	 * 
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}

	/**
	 * Setter
	 * 
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}

	/**
	 * Getter
	 * 
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * Setter
	 * 
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * Getter
	 * 
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * Setter
	 * 
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
