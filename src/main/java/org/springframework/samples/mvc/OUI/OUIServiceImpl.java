package org.springframework.samples.mvc.OUI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OUIServiceImpl implements OUIService {

	@Override
	public String getOUIbyMAC(String mac) {
		// TODO Auto-generated method stub

		    final String uri = "https://api.macvendors.com/";
		     
		    RestTemplate restTemplate = new RestTemplate();
		    String result = restTemplate.getForObject(uri + mac, String.class);
		     
		    System.out.println(result);
		
		return result;
	}

	
}
