package com.example.demo.mapper;

import com.example.demo.model.UserModel;
import com.example.demo.pojo.UserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xf on 2017/10/25.
 */
@Mapper
public interface UserMapper {
   /* 使用@Param 注解* 不使用@Param注解时，参数只能一个，并且是javaean */
    @Select("select count(id) from user where password= #{password} and name = #{name}")
    int selectUser(@Param("name") String name, @Param("password") String password);

    @Insert("insert into user(user_uid,name,password) values(#{userUid},#{name},#{password})")
    int insertUserInfo(UserDTO userDTO);

    /*不使用@Param 注解,参数只能一个，并且是javaBean*/
    @Select("select count(id) from user where name=${name}")
    int selectUserByName(UserDTO userDTO);
    @Select("select * from uesr where name= #{name}")
    UserModel selectUserInfo(String name);
}
