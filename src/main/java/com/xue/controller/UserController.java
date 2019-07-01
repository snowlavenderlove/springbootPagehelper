package com.xue.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.xue.entity.http.UserListRes;
import com.xue.entity.http.UserReq;
import com.xue.entity.model.User;
import com.xue.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/select")
	@ResponseBody
	public UserListRes indexSelect(HttpSession session,HttpServletRequest request,@RequestBody UserReq inparam){
		UserListRes res = null;
		

		try {
			res = userService.selectAllUser(inparam);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(null == res){
			System.out.println("未获得数据");
		}
		
		return res;
		
	}
	

	

}
