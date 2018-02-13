package gestion_vol.service;


import java.util.List;

import gestion_vol.bo.Vol;
public interface VolService {
	
	void addVol(Vol p);
	
	void deleteVol(Long id);
	
	List<Vol> getAllVol();
	
	void updatVol(Vol p);
	
	List<Vol> findVols(String nomUsr);
	

}
