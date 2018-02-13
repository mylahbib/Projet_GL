package gestion_vol.dao.impl;

import org.springframework.stereotype.Repository;

import com.genericdao.impl.HibernateSpringGenericDaoImpl;

import gestion_vol.bo.Ville;
import gestion_vol.dao.VilleDao;

@Repository
public class VilleDaoImpl extends HibernateSpringGenericDaoImpl<Ville, Long> implements VilleDao{

	public VilleDaoImpl() {
		super(Ville.class);
			}

}
