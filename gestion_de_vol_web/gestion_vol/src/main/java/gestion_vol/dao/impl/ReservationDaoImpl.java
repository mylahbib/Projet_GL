package gestion_vol.dao.impl;

import org.springframework.stereotype.Repository;

import com.genericdao.impl.HibernateSpringGenericDaoImpl;

import gestion_vol.bo.Reservation;
import gestion_vol.dao.ReservationDao;
@Repository
public class ReservationDaoImpl extends HibernateSpringGenericDaoImpl<Reservation, Long> implements ReservationDao{

	public ReservationDaoImpl() {
		super(Reservation.class);
		
	}

}
