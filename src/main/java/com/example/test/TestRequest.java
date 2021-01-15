package com.example.test;

import javax.validation.constraints.NotBlank;

public class TestRequest {

    @NotBlank(message = "It can not be blank!")
    private String id;

    public TestRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
