package com.ai.service;

import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.embedding.EmbeddingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public class AIService {

        private final EmbeddingModel embeddingModel;

    @Autowired
    public AIService(EmbeddingModel embeddingModel) {
        this.embeddingModel = embeddingModel;
    }

    @GetMapping("/ai/embedding")
    public Map embed(String message) {
        EmbeddingResponse embeddingResponse = this.embeddingModel.embedForResponse(List.of(message));
        return Map.of("embedding", embeddingResponse);
    }


}
