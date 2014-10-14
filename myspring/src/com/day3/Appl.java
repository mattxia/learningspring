package com.day3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.util.ApplicationContextUtil;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContextUtil.getApplicationContext()
		ApplicationContext acApplicationContext = new ClassPathXmlApplicationContext("com/day3/beans.xml");
		//获取对象
		UpperLetter upperLetter=(UpperLetter) acApplicationContext.getBean("changeLette");
		
		//
		System.out.println(upperLetter.change());
		
		ChangeLetter changeLetter = (ChangeLetter) acApplicationContext.getBean("changeLette");
		
		System.out.println(changeLetter.change());

	}

}
