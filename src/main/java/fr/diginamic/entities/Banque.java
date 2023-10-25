package fr.diginamic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Banque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nom;

}
