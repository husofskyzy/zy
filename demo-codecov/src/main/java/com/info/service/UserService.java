package com.info.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String show(String name){
        return name+" show";
    }

//    public String add(String name){
//        return name+" add";
//    }
}
