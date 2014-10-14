package com.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.util.ApplicationContextUtil;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContextUtil.getApplicationContext()
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/collection/beans.xml");
		Department dept = (Department) acApplicationContext.getBean("department");
		System.out.println(dept);
		//System.out.println(dept.getEmployee());
		
		//
		for(Employee employee : dept.getEmpList())
		{
			System.out.println(employee.getName());
		}
		
		for(Employee employee : dept.getEmpSet())
		{
			System.out.println(employee.getName());
		}
		
		System.out.println("迭代器方法++++++++++++++++++++++++");
		//1.迭代器方法
		Map<String, Employee> empMaps = dept.getEmpMaps();
		Iterator iterator = dept.getEmpMaps().keySet().iterator();
		while(iterator.hasNext())
		{
			String key = (String) iterator.next();
			
			System.out.println(empMaps.get(key).getName());
		}
		
		//简洁方法
		for(Entry<String,Employee> employee: dept.getEmpMaps().entrySet())
		{
			System.out.println(employee.getKey()+"="+employee.getValue().getName());
		}
		
		System.out.println("通过properties取出数据");
		System.out.println(dept.getProps().toString());
	}

}
