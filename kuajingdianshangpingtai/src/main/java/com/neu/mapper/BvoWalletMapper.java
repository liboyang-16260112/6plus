package com.neu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.Bvowallet;

@Mapper
public interface BvoWalletMapper {
	@Insert("insert into bvowallet(bvoaccount_name,bvoaccount_email,bvoaccount_pwd)values(#{bvoaccount_name},#{bvoaccount_email},#{bvoaccount_pwd})")
	public int insertBvowallet(Bvowallet bvowallet);
	
	@Select("select * from bvowallet where bvoaccount_name=#{bvoaccount_name}")
	public Bvowallet selectBvowallet(String bvoaccount_name);
	
	@Select("select * from bvowallet where bvoaccount_name=#{bvoaccount_name} and bvoaccount_email=#{bvoaccount_email} and bvoaccount_pwd=#{bvoaccount_pwd}")
	public int selectBvoAll(Bvowallet bvowallet);
	

}
