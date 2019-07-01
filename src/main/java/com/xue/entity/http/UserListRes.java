package com.xue.entity.http;

import java.util.List;

import com.xue.entity.model.User;

public class UserListRes extends BasePageRes{
	
	private List<User> dataList;

	public List<User> getDataList() {
		return dataList;
	}

	public void setDataList(List<User> dataList) {
		this.dataList = dataList;
	}
	
	
	

}
