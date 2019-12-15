package com.canway.web.mapper;

import java.util.List;

import com.canway.web.domain.User;

public interface UserMapper {
	
	public List<User> selectAll();
	
	public User selectById(User user);
	
	public List<User> selectByName(User user);

}
