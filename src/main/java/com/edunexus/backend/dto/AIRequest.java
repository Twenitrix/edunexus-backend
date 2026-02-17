package com.edunexus.backend.dto;

import lombok.Data;

@Data
public class AIRequest {
    private String question;
    private Long subjectId;
}