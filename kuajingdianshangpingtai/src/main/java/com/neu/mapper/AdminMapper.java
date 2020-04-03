package com.neu.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neu.pojo.DataDictionary;
import com.neu.pojo.Parameter;

@Mapper
public interface AdminMapper {
		@Select("select * from parameter" )
		public ArrayList<Parameter> queryAll();
		@Select("select  * from  parameter where Parameter_id=#{Parameter_id}")
	    public  Parameter  queryByid(String pa_id);
		@Update("update parameter set Parameter_value=#{Parameter_value},Parameter_description=#{Parameter_description} where Parameter_id=#{Parameter_id}")
		public void upadteParameter(Parameter p);
		@Insert("insert into parameter(Parameter_id,Parameter_value,Parameter_description) values(#{param1},#{param2},#{param3})")
		public void parameter2(String Parameter_id,Integer Parameter_value,String Parameter_description);
		@Delete("delete from parameter where Parameter_id=#{Parameter_id}")
		public void deleteParameter(String Parameter_id);
		
		@Select("select * from datadictionary" )
		public ArrayList<DataDictionary> queryAll1();
		@Select("select  * from  datadictionary where dic_id=#{dic_id}")
	    public  DataDictionary  queryBydid(int datadictionary_id);
		@Update("update dd set dd_type=#{dd_type},dd_description=#{dic_description},dic_code=#{dic_code},dic_value=#{dic_value} where dic_id=#{dic_id}")
		public void upadteDd(DataDictionary dataDictionary);
		@Insert("insert into datadictionary(dic_type,dic_description,dic_code,dic_value) values(#{param1},#{param2},#{param3},#{param4})")
		public void dd2(String dic_type,String dic_description,Integer dic_code,String dic_value);
		@Delete("delete from datadictionary where dic_id=#{dic_id}")
		public void deleteDd(int dic_id);
}
