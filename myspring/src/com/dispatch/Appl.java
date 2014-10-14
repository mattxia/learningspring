package com.dispatch;

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
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/dispatch/beans.xml");
		DBUtil dbUtil = (DBUtil) acApplicationContext.getBean("dbutil");
		System.out.println(dbUtil.getDriverName()+","+dbUtil.getName()+","+dbUtil.getPwd()+","+dbUtil.getUrl());
		
		DBUtil dbUtil2 = (DBUtil) acApplicationContext.getBean("dbutil2");
		System.out.println(dbUtil2.getDriverName()+","+dbUtil2.getName()+","+dbUtil2.getPwd()+","+dbUtil2.getUrl());
		
	}

}
