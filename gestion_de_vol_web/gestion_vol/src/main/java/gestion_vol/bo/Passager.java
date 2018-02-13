package gestion_vol.bo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Passager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String nom;
	private String preom;
	
	

	@OneToMany(mappedBy="passager",fetch=FetchType.LAZY)
	Collection<Client> clients ;
	
	
	
	
	
	
	public Passager(String nom, String preom) {
		super();
		this.nom = nom;
		this.preom = preom;
	}
	public Passager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPreom() {
		return preom;
	}
	public void setPreom(String preom) {
		this.preom = preom;
	}
	public Long getId() {
		return id;
	}
	public Collection<Client> getClients() {
		return clients;
	}
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	public Passager(String nom, String preom, Collection<Client> clients) {
		super();
		this.nom = nom;
		this.preom = preom;
		this.clients = clients;
	}
	
	
	
	

}
