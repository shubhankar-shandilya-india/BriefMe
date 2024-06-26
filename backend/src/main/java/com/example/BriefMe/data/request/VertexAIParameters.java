package com.example.BriefMe.data.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VertexAIParameters {
    Double temperature;
    Integer maxOutputTokens;
    Double topP;
    Integer topK;
}
