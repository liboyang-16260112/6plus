package com.neu.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@Configuration
public class DruidConfig {
	//配置druid数据库datasource
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druid() {
		return new DruidDataSource();
	}
	//1.配置一个管理后台的servlet
	@Bean
	public ServletRegistrationBean statViweServlet() {
		ServletRegistrationBean bean =new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
		Map<String, String> map=new HashMap<String, String>();
		map.put("loginUsername","root");
		map.put("loginPassword","123");
		map.put("allow","");
		bean.setInitParameters(map);
		return bean;
	}
	
	@Bean
	public FilterRegistrationBean webStatFilter() {
		FilterRegistrationBean bean=new FilterRegistrationBean();
		bean.setFilter(new WebStatFilter());
		Map<String, String> map=new HashMap<String, String>();
		map.put("exclusion", "*.js,*.css,*.jpg,*.png,/regist,/druid/*,/static/**");
		bean.setInitParameters(map);
		bean.setUrlPatterns(Arrays.asList("/*"));
		return bean;
	}

}
