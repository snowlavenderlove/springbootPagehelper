package com.xue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xue.entity.http.UserListRes;
import com.xue.entity.http.UserReq;
import com.xue.entity.model.User;
import com.xue.repository.dao.UserMapper;
import com.xue.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserListRes selectAllUser(UserReq req) {
		

//		pageIndex为当前页码;pageSize每页显示记录数;count=true则进行count查询总记录数
		PageHelper.startPage(req.getPageIndex(),req.getPageSize(),true);

		List<User> datas = userMapper.selectAllUser();
		
		PageInfo<User> page = new PageInfo<User>(datas);
		
		UserListRes res = new UserListRes();
		
		res.setAllCount((int)page.getTotal());
		
		res.setDataList(datas);
		
		return res;
	}

	
	
	
	
	

}
