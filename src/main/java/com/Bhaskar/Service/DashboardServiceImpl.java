package com.Bhaskar.Service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Bhaskar.Binding.Quote;
import com.Bhaskar.Props.AppProps;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DashboardServiceImpl implements DashboardService {

	@Autowired
	private AppProps props;
	
	private Quote[] quotes = null;

	Random r = new Random();

	@Override
	public String getQuote() {
		String text="";
		if (quotes == null) {
			
			String quoteUrl=props.getMessages().get("quoteEndpointUrl");

			
			RestTemplate rt = new RestTemplate();
			ResponseEntity<String> forEntity = rt.getForEntity(quoteUrl, String.class);
			String body = forEntity.getBody();

			ObjectMapper mapper = new ObjectMapper();
			try {
				quotes = mapper.readValue(body, Quote[].class);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			else {
		int nextInt = r.nextInt(quotes.length - 1);
		 text=quotes[nextInt].getText();
	}
      return text;	
			
      
	}}
			
