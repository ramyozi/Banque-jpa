package fr.diginamic.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String numero;
	Double solde;
}
