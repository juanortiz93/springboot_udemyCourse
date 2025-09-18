package com.juan.curso.springboot.webapp.springboot_web.models.dto;

import com.juan.curso.springboot.webapp.springboot_web.models.User;

public class UserDto {
    
    private String title;
    private User user;

    public String getTitle() {
        return title;
    }

    public User getUser() {
        return user;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }

    

}
