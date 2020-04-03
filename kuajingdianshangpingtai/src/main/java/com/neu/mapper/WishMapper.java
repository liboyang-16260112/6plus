package com.neu.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neu.pojo.Wishlist;

@Mapper
public interface WishMapper {
	@Insert("insert into  wishlist(seller_id,goog_id,price,sku)values(#{arg0},#{arg1},#{arg2},#{arg3})")
			 public   void  addWish(String seller_id,String goog_id,int price,String sku);
			    @Select("select * from wishlist ")
			    public ArrayList<Wishlist> bvoWishQueryAll( );
}
