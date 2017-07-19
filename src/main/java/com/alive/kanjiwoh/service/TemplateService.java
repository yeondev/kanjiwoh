package com.alive.kanjiwoh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alive.kanjiwoh.mapper.TemplateMapper;
import com.alive.kanjiwoh.model.TemplateDto;
import com.alive.kanjiwoh.user.DummyUserInfo;

@Service
public class TemplateService {

	@Autowired
	TemplateMapper templateMapper;
	
	public TemplateDto get() {
		DummyUserInfo dummyUserInfo = new DummyUserInfo();
		
		return templateMapper.selectTemplateInfo(dummyUserInfo.getUserId());
	}
}
