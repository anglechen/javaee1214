package com.canway.web.service;

import java.util.List;

import com.canway.web.domain.User;

public interface UserService {
	
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
	
    List<User> selectAll(User user);

}
