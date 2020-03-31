package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class ParameterManager {
	private int Parameter_id;
	private String Parameter_description;
	private String Parameter_value;

	public ParameterManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParameterManager(int parameter_id, String parameter_description, String parameter_value) {
		super();
		Parameter_id = parameter_id;
		Parameter_description = parameter_description;
		Parameter_value = parameter_value;
	}

	public int getParameter_id() {
		return Parameter_id;
	}

	public void setParameter_id(int parameter_id) {
		Parameter_id = parameter_id;
	}

	public String getParameter_description() {
		return Parameter_description;
	}

	public void setParameter_description(String parameter_description) {
		Parameter_description = parameter_description;
	}

	public String getParameter_value() {
		return Parameter_value;
	}

	public void setParameter_value(String parameter_value) {
		Parameter_value = parameter_value;
	}

}
