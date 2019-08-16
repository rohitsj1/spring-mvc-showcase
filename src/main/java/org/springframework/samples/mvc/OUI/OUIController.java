package org.springframework.samples.mvc.OUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OUIController {

	@Autowired
	private OUIManager ouimgr;
	
	@GetMapping ("/OUI")
	public String getDataFromExernalWSet() {
		return ouimgr.getOUIbyMAC();
	}
		
	
}


