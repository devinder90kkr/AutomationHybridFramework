package cuesz.utils;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.network.Network;
import org.openqa.selenium.devtools.v114.network.model.Response;
import org.openqa.selenium.devtools.v114.network.model.Request;
import org.openqa.selenium.devtools.v114.network.model.RequestId;
import org.testng.annotations.Test;


public class CapAPIResponse {
	
	ChromeDriver driver;
	@Test
	public void Apiresponse () {
		
	
		driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		// Use Optional.of() with integer values to enable Network
		devTools.send(Network.enable(Optional.of(0), Optional.of(0), Optional.of(0)));
		
		devTools.addListener(Network.requestWillBeSent(), requestConsumer -> {
			
		Request request	= 	requestConsumer.getRequest();
			
		//	System.out.println(request.getUrl());
				
		});
		
		final RequestId [] requestId  = new RequestId[1];
		
		devTools.addListener(Network.responseReceived(), responseConsumer ->{
		Response response = responseConsumer.getResponse();
		requestId[0] = responseConsumer.getRequestId();
		
		System.out.println(response.getStatus()+ " "+ response.getUrl());
		
		String responseBody = devTools.send(Network.getResponseBody(requestId[0] )).getBody();
		System.err.println(responseBody);
		
		
		});
			
		
	}
	

}
