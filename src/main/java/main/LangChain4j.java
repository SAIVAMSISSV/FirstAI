package main;

import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;

public class LangChain4j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SystemMessage systemMessage=SystemMessage.systemMessage("please provide the reponse only when questions releated to java programming language");
		UserMessage usermessage = UserMessage.userMessage("where Bali locate");
		
		OpenAiChatModel model = OpenAiChatModel.builder()
			    .apiKey(System.getenv("OPENAI_API_KEY"))
			    .modelName("gpt-4o-mini")
			    .build();
		//ChatResponse res=model.chat(systemMessage,usermessage);
//		String res=model.chat("what is lagnchanin4j");
		//System.out.println(res.aiMessage());
		VamsiAIService vamsiservice=AiServices.create(VamsiAIService.class, model);
		String res=vamsiservice.explain("whar are virtual threads in java");
		System.out.println(res);
		

	}

}
