package gestion_vol.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gestion_vol.bo.Vol;

import gestion_vol.dao.VolDao;
import gestion_vol.service.VolService;
@Service
@Transactional
public class VolServiceImpl implements VolService{
	
	@Autowired
	private VolDao volDao;
	
	
	public VolServiceImpl() {
	System.out.println("vol service ceer");
	}
	

	public void addVol(Vol p) {
		volDao.create(p);
		
	}


	public void deleteVol(Long id) {
		volDao.delete(id);

		
	}



	public void updatVol(Vol p) {
		volDao.update(p);
	}


	public List<Vol> findVols(String nomUsr) {
		// TODO Auto-generated method stub
		return null;
	}



	public List<Vol> getAllVol() {
		
		return null;
	}	

	
	


}
