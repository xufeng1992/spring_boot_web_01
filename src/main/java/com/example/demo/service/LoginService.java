package com.example.demo.service;

import com.example.demo.pojo.UserDTO;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xf on 2017/10/25.
 */
public interface LoginService {
    String findUser(UserDTO userDTO) throws NoSuchAlgorithmException, UnsupportedEncodingException;

    String createUser(UserDTO userDTO) throws NoSuchAlgorithmException, UnsupportedEncodingException;
}
