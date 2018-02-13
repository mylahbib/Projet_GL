package gestion_vol.dao.impl;

import org.springframework.stereotype.Repository;

import com.genericdao.impl.HibernateSpringGenericDaoImpl;

import gestion_vol.bo.Passager;
import gestion_vol.dao.PassagerDao;
@Repository
public class PassagerDaoImpl extends HibernateSpringGenericDaoImpl<Passager, Long> implements PassagerDao{

	public PassagerDaoImpl() {
		super(Passager.class);
		
	}

}
