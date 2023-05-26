package com.pro.eun.main.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pro.eun.main.service.TestService;
import com.pro.eun.main.service.TestVO;

import jakarta.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements TestService{

	@Resource(name="testMapper")
	private TestMapper testDao;
	
	@Override
	public List<TestVO> selectTest() {
		return testDao.selectTest();
	}
	
}
