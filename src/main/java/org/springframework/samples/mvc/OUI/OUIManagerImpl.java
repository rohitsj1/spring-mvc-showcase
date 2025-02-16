package org.springframework.samples.mvc.OUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OUIManagerImpl implements OUIManager{
	
	@Autowired
	private OUIService ouiDao;
	
	@Override
	public String getOUIbyMAC() {
		return ouiDao.getOUIbyMAC("FC-A1-3E-2A-1C-33");
		
	}
}
