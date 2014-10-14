package com.inherit;

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
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/inherit/beans.xml");
		Graduate graduate = (Graduate) acApplicationContext.getBean("graduate");
		System.out.println(graduate.getName()+",age:"+graduate.getAge()+", degree: "+graduate.getDegree());
		
	}

}
