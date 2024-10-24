package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
