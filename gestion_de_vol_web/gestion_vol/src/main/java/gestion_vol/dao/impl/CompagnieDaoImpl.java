package gestion_vol.dao.impl;

import org.springframework.stereotype.Repository;

import com.genericdao.impl.HibernateSpringGenericDaoImpl;

import gestion_vol.bo.Compagnie;

import gestion_vol.dao.CompagnieDao;
@Repository
public class CompagnieDaoImpl extends HibernateSpringGenericDaoImpl<Compagnie, Long> implements CompagnieDao{

	public CompagnieDaoImpl() {
		super(Compagnie.class);
		
	}

}
