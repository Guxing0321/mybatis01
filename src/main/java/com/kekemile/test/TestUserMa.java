package com.kekemile.test;

import java.io.IOException;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.kekemile.mapper.UserMapper;
import com.kekemile.po.User;

public class TestUserMa {

	private SqlSessionFactory factory;

	@Before
	public void initSqlSession() throws IOException {

		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

		factory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void Test() {
		SqlSession openSession = factory.openSession();
		UserMapper userMapper = openSession.getMapper(UserMapper.class);
		User u = userMapper.selectUserById(1);

		System.out.println(u);
	}
}
