package com.neu.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neu.pojo.Ordervo;


@Mapper
public interface OrderMapper {
	@Insert("insert into   Ordervo (order_quantity,order_status,order_id,seller_id,good_id,good_name,order_price,sku,order_time)values(#{order_quantity},#{order_status},#{order_id},#{seller_id},#{good_id},#{good_name},#{order_price},#{sku},#{order_time}")
	public int insertOrdervo(Ordervo ordervo);
    @Select("select * from ordervo where order_id=#{order_id}")
	public Ordervo selectByOrder_id(String order_id);
    @Update("update Ordervo set order_quantity=#{order_quantity} where order_id=#{order_id}")
    public Ordervo updateOrdervoOrder_quantity(String order_id);
	
}
