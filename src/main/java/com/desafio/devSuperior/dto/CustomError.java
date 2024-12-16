package com.desafio.devSuperior.dto;

import java.time.Instant;

public class CustomError {

    private Instant timestamo;
    private Integer status;
    private String error;
    private String path;

    public CustomError(Instant timestamo, Integer status, String error, String path) {
        this.timestamo = timestamo;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimestamo() {
        return timestamo;
    }

    public Integer getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }
}
