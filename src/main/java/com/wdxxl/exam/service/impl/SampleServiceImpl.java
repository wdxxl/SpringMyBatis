package com.wdxxl.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdxxl.exam.mapper.SampleMapper;
import com.wdxxl.exam.model.Sample;
import com.wdxxl.exam.model.SampleExample;
import com.wdxxl.exam.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {
	@Autowired
	private SampleMapper sampleMapper;
	
	public Sample doSomeBusinessStuff(Integer sampleId) {         
	  return sampleMapper.selectByPrimaryKey(sampleId);
	}
	
	public List<Sample> doSomeListStuff(){
		 SampleExample example = new SampleExample();  
         example.createCriteria().andIdIsNotNull(); 
         return sampleMapper.selectByExample(example);
	}

	public void selectDistinctName() {
		List<String> names = sampleMapper.selectDistinctName(1);
		System.out.println("distinct size: "+ names.size());
		
	}
}
