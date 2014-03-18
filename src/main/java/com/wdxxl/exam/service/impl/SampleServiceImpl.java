package com.wdxxl.exam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdxxl.exam.mapper.SampleMapper;
import com.wdxxl.exam.model.Sample;
import com.wdxxl.exam.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {
	@Autowired
	private SampleMapper sampleMapper;
	
	public Sample doSomeBusinessStuff(Integer sampleId) {
	  return sampleMapper.selectByPrimaryKey(sampleId);
	}
}
