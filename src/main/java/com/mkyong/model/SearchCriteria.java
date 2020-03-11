package com.mkyong.model;

import javax.validation.constraints.NotEmpty;

public class SearchCriteria {

    @NotEmpty(message = "username can't empty!")
    String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}