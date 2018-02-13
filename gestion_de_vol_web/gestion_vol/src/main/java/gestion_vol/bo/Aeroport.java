package gestion_vol.bo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Aeroport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	

	@OneToMany(mappedBy="aeroport",fetch=FetchType.LAZY)
	Collection<Vol> vols ;
	
	

	@OneToMany(mappedBy="aeroport",fetch=FetchType.LAZY)
	Collection<Ville> villes ;
	
	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}
	public Aeroport() {
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
//	public Collection<Vol> getVols() {
//		return vols;
//	}
//	public void setVols(Collection<Vol> vols) {
//		this.vols = vols;
//	}
//	public Collection<Ville> getVilles() {
//		return villes;
//	}
//	public void setVilles(Collection<Ville> villes) {
//		this.villes = villes;
//	}
//	public Aeroport(String nom, Collection<Vol> vols, Collection<Ville> villes) {
//		super();
//		this.nom = nom;
//		this.vols = vols;
//		this.villes = villes;
//	}
//	
//	
//	
	

}
