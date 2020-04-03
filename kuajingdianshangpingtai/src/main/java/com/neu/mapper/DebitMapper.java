package com.neu.mapper;



import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;




@Mapper
public interface DebitMapper {

	@Insert("insert into   debit (dname,email,telephone)values(#{arg0},#{arg1},#{arg2})")
	   public	 void insertDebit(String dname,String email,String telephone);

	
}
