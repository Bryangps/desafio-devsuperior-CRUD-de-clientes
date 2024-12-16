package com.desafio.devSuperior.dto;

public class FieldMessage {

    private String fiedName;
    private String message;

    public FieldMessage(String fiedName, String message) {
        this.fiedName = fiedName;
        this.message = message;
    }

    public String getFiedName() {
        return fiedName;
    }

    public String getMessage() {
        return message;
    }
}
