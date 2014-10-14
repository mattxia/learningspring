package com.day3;

public class UpperLetter implements ChangeLetter {
	
	private String str;
	

	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	@Override
	public String change() {
		// TODO Auto-generated method stub
		//把小写->大写
		return str.toUpperCase();

	}

}
