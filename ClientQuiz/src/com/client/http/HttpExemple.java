/**
 * 
 */
package com.client.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;









/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class HttpExemple {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		
				HttpClient client=HttpClient.newBuilder().build();
				URI uri=URI.create("https://raw.githubusercontent.com/benlahmar/Angular8/master/src/app/model/csharp.json");
				HttpRequest req=HttpRequest.newBuilder(uri).build();
				
				HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());
				System.out.println(response.statusCode());
			//System.out.println( response.body());
				
				
				//ObjectMapper mapper=new ObjectMapper();
				//Quiz cc = mapper.readValue(response.body(), Quiz.class);
				
				
				CompletableFuture<HttpResponse<String>> rs = client.sendAsync(req, HttpResponse.BodyHandlers.ofString());
		rs.thenAccept(x-> System.out.println(x.body()));
		System.out.println("ok");
		
		TestFlow t=new TestFlow();
		t.onComplete();

	}

}
