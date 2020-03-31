package com.neu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.Brand;

@Mapper
public interface BrandMapper {
	// 添加品牌商信息
	@Insert("insert into   brand (cname,introduction,reporttype,address)values(#{cname},#{introduction},#{reporttype},#{address})")
	public int insertBrand(Brand brand);

	// 通过检索名字找到品牌商
	@Select("select * from brand where cname=#{cname}")
	public Brand selectByCname(String cname);

}
