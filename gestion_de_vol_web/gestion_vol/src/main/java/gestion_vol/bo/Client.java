package gestion_vol.bo;

import java.util.Collection;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(length=50)
	private String nom;
	@Column(length=50)
	private String prenom;
	@Column(length=50)
	private String email;
	
	@ManyToOne
	@JoinColumn(name="ID_PASSAGER")
	private Passager passager;

	@OneToMany(mappedBy="client",fetch=FetchType.LAZY)
	Collection<Reservation> reservations ;
	
	
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Long getId() {
		return id;
	}




	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}




	public Collection<Reservation> getReservations() {
		return reservations;
	}




	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}




	public Client(String nom, String prenom, String email, Collection<Reservation> reservations) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.reservations = reservations;
	}

	
	
	
	
	
	

}
