package org.springframework.samples.mvc.OUI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OUIServiceImpl implements OUIService {

	@Override
	public String getOUIbyMAC() {
		// TODO Auto-generated method stub

		    final String uri = "https://api.macvendors.com/";
		     
		    RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.getForObject(uri + "/FC-A1-3E-2A-1C-33", String.class);
		     
		    System.out.println(result);
		
		return result;
	}

	
}
