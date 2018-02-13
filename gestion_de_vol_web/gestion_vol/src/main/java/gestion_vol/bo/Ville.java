package gestion_vol.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Ville {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	@ManyToOne
	@JoinColumn(name="ID_AEROPORT")
	private Aeroport aeroport;
	
	
	
	public Ville(String nom) {
		super();
		this.nom = nom;
	}
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Long getId() {
		return id;
	}
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	public Ville(String nom, Aeroport aeroport) {
		super();
		this.nom = nom;
		this.aeroport = aeroport;
	}
	
	
	

}
