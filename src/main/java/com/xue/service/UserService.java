package com.xue.service;

import com.github.pagehelper.PageInfo;
import com.xue.entity.http.UserListRes;
import com.xue.entity.http.UserReq;
import com.xue.entity.model.User;

public interface UserService {
	
	public UserListRes selectAllUser(UserReq req);

}
