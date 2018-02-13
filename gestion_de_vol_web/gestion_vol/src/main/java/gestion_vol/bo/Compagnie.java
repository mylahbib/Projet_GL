package gestion_vol.bo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Compagnie{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@OneToMany(mappedBy="compagnie",fetch=FetchType.LAZY)
	private Collection<Vol> vols ;
	
	
	
	public Compagnie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Compagnie(String nom) {
		super();
		this.nom = nom;
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
//
//	public Collection<Vol> getVols() {
//		return vols;
//	}
//
//	public void setVols(Collection<Vol> vols) {
//		this.vols = vols;
//	}
//
//	public Compagnie(String nom, Collection<Vol> vols) {
//		super();
//		this.nom = nom;
//		this.vols = vols;
//	}
	
	
	
	
	
}
