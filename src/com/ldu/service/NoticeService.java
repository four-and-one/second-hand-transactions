package com.ldu.service;

import java.util.List;

import com.ldu.entity.Notice;

public interface NoticeService {

	List<Notice> getNoticeList();
	
	public void insertSelective(Notice notice);
	
	



}
