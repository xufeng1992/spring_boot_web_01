package com.example.demo.service.impl;

import com.example.demo.common.Constant;
import com.example.demo.common.ResultBuild;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserModel;
import com.example.demo.pojo.UserDTO;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by xf on 2017/10/25.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public String findUser(UserDTO userDTO) throws NoSuchAlgorithmException, UnsupportedEncodingException {
//        int count = userMapper.selectUser(userDTO.getName(),userDTO.getPassword());
        UserModel userModel = userMapper.selectUserInfo(userDTO.getName());
        if (null != userModel){
            String mdPassword = userModel.getPassword();
            String getPassword = userDTO.getPassword();
            BASE64Encoder base64 = new BASE64Encoder();
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            String password= base64.encode(md5.digest(getPassword.getBytes("UTF-8")));
            if (password.equals(mdPassword)) {
                return ResultBuild.buildSuccess(1,"登入成功!");
            } else {
                return ResultBuild.buildError("100","密码错误");
            }
        } else {
            return ResultBuild.buildError("100","用户不存在");

        }
    }

    @Override
    public String createUser(UserDTO userDTO) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        int result = userMapper.selectUserByName(userDTO);
        if (result >0 ){
            return ResultBuild.buildError(Constant.USER_EXISTED,"用户已存在！"+userDTO.getName());
        }
        StringBuilder userUid = new StringBuilder();
        for (int i = 0;i<9;i++){
            double randomNum = (Math.random()*9);
            long b = Math.round(randomNum);
            userUid.append(b);
        }
        //md5加密算法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String mdPassword = base64Encoder.encode(md5.digest(userDTO.getPassword().getBytes("UTF-8")));
       userDTO.setPassword(mdPassword);
        userDTO.setUserUid(userUid.toString());
        int count = userMapper.insertUserInfo(userDTO);
        if (count >0 ){
            return ResultBuild.buildSuccess(count,"注册成功");
        } else {
            return ResultBuild.buildError(Constant.UESR_CREATE_FAIL,"注册失败！");
        }
    }
}
