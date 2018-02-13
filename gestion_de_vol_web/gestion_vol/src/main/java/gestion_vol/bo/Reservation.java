package gestion_vol.bo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
 @Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numero;
	private Date date;
	@ManyToOne
	@JoinColumn(name="ID_VOL")
	private Vol vol;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
  public enum  EtatReservation { ANNULEE , CONFERMEE }
	
	public Long getNumero() {
		return numero;
	}
	
	
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}


	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reservation(Long numero, Date date) {
		super();
		this.numero = numero;
		this.date = date;
	}


	public Vol getVol() {
		return vol;
	}


	public void setVol(Vol vol) {
		this.vol = vol;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Reservation(Date date, Vol vol, Client client) {
		super();
		this.date = date;
		this.vol = vol;
		this.client = client;
	}


	public Reservation(Long numero, Date date, Vol vol, Client client) {
		super();
		this.numero = numero;
		this.date = date;
		this.vol = vol;
		this.client = client;
	}
	
	
	
}
