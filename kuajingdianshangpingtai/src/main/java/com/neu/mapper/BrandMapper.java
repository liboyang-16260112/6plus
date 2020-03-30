package com.neu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.neu.pojo.Brand;

@Mapper
public interface BrandMapper {
	@Insert("insert into   brand (cname,introduction,reporttype,address)values(#{cname},#{introduction},#{reporttype},#{address})")
	public int insertBrand(Brand brand);

}
