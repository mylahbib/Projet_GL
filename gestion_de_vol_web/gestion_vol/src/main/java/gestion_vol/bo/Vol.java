package gestion_vol.bo;



import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vol {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Date date_depart;
	private Date date_arriver;
	@ManyToOne
	@JoinColumn(name="ID_COM")
	private Compagnie compagnie;
	
	@ManyToOne
	@JoinColumn(name="ID_AEROPORT")
	private Aeroport aeroport;
	
	@OneToMany(mappedBy="vol",fetch=FetchType.LAZY)
	Collection<Reservation> reservations;
	
	
	
	
	public Vol() {
	}
	public Date getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(Date date_depart) {
		this.date_depart = date_depart;
	}
	public Date getDate_arriver() {
		return date_arriver;
	}
	public void setDate_arriver(Date date_arriver) {
		this.date_arriver = date_arriver;
	}
	public Long getId() {
		return id;
	}
	public Compagnie getCompagnie() {
		return compagnie;
	}
	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}
	public Collection<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
	public Vol(Date date_depart, Date date_arriver, Compagnie compagnie, Collection<Reservation> reservations) {
		super();
		this.date_depart = date_depart;
		this.date_arriver = date_arriver;
		this.compagnie = compagnie;
		this.reservations = reservations;
	}
	public Vol(Date date_depart, Date date_arriver) {
		super();
		this.date_depart = date_depart;
		this.date_arriver = date_arriver;
	}
	
	
}
