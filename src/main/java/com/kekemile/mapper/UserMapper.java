package com.kekemile.mapper;

import java.util.List;

import com.kekemile.po.User;

public interface UserMapper {

	public void insertUser(User user);

	public User selectUserById(int id);

	public List<User> selectUserByName(String name);

	public void UpdateUser(User user);

	public void deleteUserById(int id);
}
