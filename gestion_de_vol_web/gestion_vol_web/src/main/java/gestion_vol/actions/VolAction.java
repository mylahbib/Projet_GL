package gestion_vol.actions;



import org.springframework.beans.factory.annotation.Autowired;

import gestion_vol.bo.Vol;
import gestion_vol.service.VolService;
import gestion_vol.service.impl.VolServiceImpl;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@ResultPath(value="/")
public class VolAction extends BaseAction {

	private static final long serialVersionUID = 1L;
	
	@Autowired 
	private  VolService volService;
	private Vol vol  ; 
	
	
	@Action(value="ShowVolForm", results = { @Result(type="redirectAction", name = "success" ) })

		public String ShowVolForm() {

			return SUCCESS;
		}
	
	@Action(value="addVol", results = { @Result( location = "pages/addVol.jsp", name = "success" ) })
		public String addVol (){
		volService.addVol(vol);
		return SUCCESS;
	}



	

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}
//
//	public VolServiceImpl getVolServiceImpl() {
//		return volServiceImpl;
//	}
//
//	public void setVolServiceImpl(VolServiceImpl volServiceImpl) {
//		this.volServiceImpl = volServiceImpl;
//	}
//

	public VolAction() {
		
	}

	
	

	
	
}
