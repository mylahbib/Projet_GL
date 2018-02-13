package gestion_vol.dao.impl;

import org.springframework.stereotype.Repository;

import com.genericdao.impl.HibernateSpringGenericDaoImpl;

import gestion_vol.bo.Vol;
import gestion_vol.dao.VolDao;
@Repository
public class VolDaoImpl extends HibernateSpringGenericDaoImpl<Vol, Long> implements VolDao {

	public VolDaoImpl() {
		super(Vol.class);

		System.out.println("vol DAO creer");
	}

}
