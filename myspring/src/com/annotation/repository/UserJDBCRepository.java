package com.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJDBCRepository implements UserRepository {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserJDBCRepository Save ...");

	}

}
