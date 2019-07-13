package com.itheima.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }
    public static void main(String[] args){
        String password ="1234";
        String pwd = encodePassword(password);//$2a$10$zxuynYpTdcAo/LlMfrA.teVUeZLd6flEQ3QPu8680iHGI6zsuNEnG
        System.out.println(pwd);
    }
}
