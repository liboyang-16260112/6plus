package com.neu.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.BrandInfo;

@Mapper
public interface BrandInfoMapper {
	@Select("select * from brandinfo where cname=#{arg0}")
	public ArrayList<BrandInfo> selectByCname(String cname);

}
