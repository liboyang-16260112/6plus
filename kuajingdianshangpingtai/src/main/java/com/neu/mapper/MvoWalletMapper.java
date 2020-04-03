package com.neu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.MvoWallet;



@Mapper
public interface MvoWalletMapper {
	@Insert("insert into mvowallet(mvoaccount_name,mvoaccount_email,mvoaccount_pwd)values(#{mvoaccount_name},#{mvoaccount_email},#{mvoaccount_pwd})")
	public int insertMvowallet(MvoWallet mvoWallet);
	
	@Select("select * from mvowallet where mvoaccount_name=#{mvoaccount_name}")
	public MvoWallet selectMvowallet(String mvoaccount_name);
	
	@Select("select * from mvowallet where mvoaccount_name=#{mvoaccount_name} and mvoaccount_email=#{mvoaccount_email} and mvoaccount_pwd=#{mvoaccount_pwd}")
	public MvoWallet selectMvoAll(MvoWallet mvoWallet);
	

}
