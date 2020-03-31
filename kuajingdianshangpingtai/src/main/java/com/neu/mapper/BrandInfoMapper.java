package com.neu.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.BrandInfo;

@Mapper
public interface BrandInfoMapper {
	//通过公司名检索品牌信息
	@Select("select * from brandinfo where cname=#{cname}")
	public ArrayList<BrandInfo> selectByCname(String cname);

}
