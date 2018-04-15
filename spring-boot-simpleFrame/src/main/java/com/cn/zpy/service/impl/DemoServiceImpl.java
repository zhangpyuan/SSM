package com.cn.zpy.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.zpy.dao.DemoDao;
import com.cn.zpy.entity.Demo;
import com.cn.zpy.service.DemoService;
@Service
public class DemoServiceImpl implements DemoService{

	@Autowired
	private DemoDao demoDao;
	
	@Transactional
	public void save(Demo demo) {
		// TODO Auto-generated method stub
		demoDao.save(demo);
	}

	public List<Demo> findAll() {
		// TODO Auto-generated method stub
		return (List<Demo>) demoDao.findAll();
	}

}
