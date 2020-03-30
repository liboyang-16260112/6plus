package com.neu.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.Brand;

import groovyjarjarantlr.collections.List;

@Mapper
public interface BrandMapper {
	@Insert("insert into   brand (cname,introduction,reporttype,address)values(#{cname},#{introduction},#{reporttype},#{address})")
	public int insertBrand(Brand brand);
	
	@Select("select * from brand where cname=#{cname}")
	public Brand selectByCname(String cname);
	
	

}
