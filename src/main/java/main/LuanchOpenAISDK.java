package main;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;


public class LuanchOpenAISDK {
	
	public static void main(String args[]) {
		OpenAIClient openAi = OpenAIOkHttpClient.fromEnv();
		ResponseCreateParams parms = ResponseCreateParams.builder().input("what is telusko").model("gpt-5.6-luna").build();
		Response res=openAi.responses().create(parms);
		System.out.println(res);
	}

}
