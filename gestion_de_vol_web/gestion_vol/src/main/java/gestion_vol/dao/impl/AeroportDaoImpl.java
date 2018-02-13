package gestion_vol.dao.impl;

import org.springframework.stereotype.Repository;

import com.genericdao.impl.HibernateSpringGenericDaoImpl;

import gestion_vol.bo.Aeroport;
import gestion_vol.dao.AeroportDao;
@Repository
public class AeroportDaoImpl extends HibernateSpringGenericDaoImpl<Aeroport, Long> implements AeroportDao{

	public AeroportDaoImpl() {
		super(Aeroport.class);
		
	}

}
