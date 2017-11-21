package com.example.demo.controller;

import com.example.demo.pojo.UserDTO;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xf on 2017/10/25.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String loginView(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login.html",method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody UserDTO userDTO) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String result = loginService.findUser(userDTO);
        return result;
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public String userRegister(@RequestBody UserDTO userDTO) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String result = loginService.createUser(userDTO);
        return result;
    }
}
