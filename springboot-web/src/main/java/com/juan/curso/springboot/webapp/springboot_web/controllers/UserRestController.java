package com.juan.curso.springboot.webapp.springboot_web.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.juan.curso.springboot.webapp.springboot_web.models.User;
import com.juan.curso.springboot.webapp.springboot_web.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")     
    public UserDto details(){

        User user = new User("Juan Carlos", "Ortiz");
        UserDto userDto = new UserDto();       
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot!");

        return userDto;
    }

    @GetMapping(path = "/details-map")     
    public Map<String, Object> detailsMap(){

        User user = new User("Juan Carlos", "Ortiz");

        Map <String,Object> body = new HashMap<>();
        body.put("title", "Hola Mundo!");
        body.put("user", user);
       

        return body;
    }

}
