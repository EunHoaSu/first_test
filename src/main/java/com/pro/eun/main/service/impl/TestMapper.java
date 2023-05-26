package com.pro.eun.main.service.impl;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pro.eun.main.service.TestVO;

@Mapper
public interface TestMapper {

	List<TestVO> selectTest();


	
}
