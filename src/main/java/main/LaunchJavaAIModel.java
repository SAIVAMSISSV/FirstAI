package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LaunchJavaAIModel {
	
	public static void main(String args[]) throws IOException, InterruptedException{
		String API_key=System.getenv("OPENAI_KEY");
		//String API_key="k3QIqBjekmI8zfpuMtRv";
		String RequestBody = """
				{
				    "model":"gpt-5.6-luna",
				    "input":"Explain AgenticAI"
				}
				""";
		//HTTP Client
		HttpClient httpclient=HttpClient.newHttpClient();
		HttpRequest request=HttpRequest.newBuilder()
		.uri(URI.create("https://api.openai.com/v1/responses"))
		.header("Authorization","Bearer "+API_key)
		.header("content-type","application/json")
		.POST(HttpRequest.BodyPublishers.ofString(RequestBody))
		.build();//HTTPreqbody
		//httpclient.send(request,HttpResponse.BodySubscribers.ofString(null)))
		HttpResponse<String> response=httpclient.send(request,HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
	}

}
