package com.canway.web.mapper;

import java.util.List;

import com.canway.web.domain.User;

public interface UserMapper {
	
	public List<User> selectAll(User user);
	
	
	public List<User> selectByAll(User user);
	
	public User selectById(User user);
	
	public List<User> selectByName(User user);
	
	
	public void insert(User user);
	
	
	public void update(User user);
	
	public void delete(int id);

}
