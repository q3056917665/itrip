package com.example.utils;

import java.util.UUID;

public class RegisterUtils {
    public static String getEmailUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static Integer getPhoneUUID(){
        return (int)((Math.random()*9+1)*100000);
    }
}
