package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import com.github.pagehelper.Page;


@Repository
public interface UserMapper {
    @Select("select * from user")
    Page<User> findAll();

    @Select("select * from user where id=#{id}")
    User findById(@Param("id") long bookId);

    @Delete("delete from user where id = #{id}")
    void deleteById(@Param("id") long id);

    @Insert("insert into user(name) values(#{name})")
    void insertUser(@Param("name") String name);

    @Update("update user set name = #{name} where id = #{id}")
    void updateUser(@Param("name") String name,@Param("id") int id);
}
