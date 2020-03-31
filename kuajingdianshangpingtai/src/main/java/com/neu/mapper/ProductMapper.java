package com.neu.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.Goods;

@Mapper
public interface ProductMapper {
	//添加商品信息
	@Insert("insert into goods(good_name,good_length,good_width,good_height,weight,sku,upc,ena,good_type,price,warranty,edescription,aedescription)values(#{good_name},#{good_length},#{good_width},#{good_height},#{weight},#{sku},#{upc},#{ena},#{good_type},#{price},#{warranty},#{edescription},#{aedescription})")
	public int insertGoods(Goods goods);
	//查询全部商品
	@Select("select * from goods")
	public ArrayList<Goods> selectAll();

}
