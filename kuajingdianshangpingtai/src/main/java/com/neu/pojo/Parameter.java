package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Parameter {
	private String Parameter_id;
	private String Parameter_description;
	private int Parameter_value;

	public Parameter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parameter(String parameter_id, String parameter_description, int parameter_value) {
		super();
		Parameter_id = parameter_id;
		Parameter_description = parameter_description;
		Parameter_value = parameter_value;
	}

	public String getParameter_id() {
		return Parameter_id;
	}

	public void setParameter_id(String parameter_id) {
		Parameter_id = parameter_id;
	}

	public String getParameter_description() {
		return Parameter_description;
	}

	public void setParameter_description(String parameter_description) {
		Parameter_description = parameter_description;
	}

	public int getParameter_value() {
		return Parameter_value;
	}

	public void setParameter_value(int parameter_value) {
		Parameter_value = parameter_value;
	}


}
