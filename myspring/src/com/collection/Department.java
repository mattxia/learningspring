package com.collection;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Department {
	private String name;
	//private String[] employee;
	
	private List<Employee> empList;
	
	private Set<Employee> empSet;
	
	private Map<String, Employee> empMaps;
	
	private Properties props;
	
	
	
	
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Map<String, Employee> getEmpMaps() {
		return empMaps;
	}
	public void setEmpMaps(Map<String, Employee> empMaps) {
		this.empMaps = empMaps;
	}
	public Set<Employee> getEmpSet() {
		return empSet;
	}
	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	
	
	
	

}
