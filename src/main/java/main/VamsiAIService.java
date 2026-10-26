package main;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface VamsiAIService {
    @SystemMessage("""
    		please provide the reponse only when questions releated to java programming language
    		""")
    @UserMessage("""
    		explain {{topic}} in just one sentense
    		""")
	String explain(@V("topic")String prompt);
}
