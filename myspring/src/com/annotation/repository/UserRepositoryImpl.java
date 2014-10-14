package com.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.annotation.TestObject;

//可以通过Repository设置bean的名字("userRepository")
@Repository
public class UserRepositoryImpl implements UserRepository {

	//没有也行的话，可以设置required为false
	@Autowired(required=false)
	private TestObject testObject;
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepository Save...");
		System.out.println(testObject);

	}

}
