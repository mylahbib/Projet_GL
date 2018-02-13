package gestion_vol.dao.impl;

import org.springframework.stereotype.Repository;

import com.genericdao.impl.HibernateSpringGenericDaoImpl;

import gestion_vol.bo.Client;

import gestion_vol.dao.ClientDao;
@Repository
public class ClientDaoImpl extends HibernateSpringGenericDaoImpl<Client, Long> implements ClientDao{

	public ClientDaoImpl() {
		super(Client.class);
		
	}

}
