package com.neu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.User;

@Mapper
public interface UserMapper {

	@Insert("insert into   user (username,pwd,identity)values(#{0},#{1},#{2}) ")
   public	 void insertUser(String username, String pwd,String identity);

	@Select("select  * from  user  where username=#{username}")
	public  User queryByUsername(String username);

	

}
