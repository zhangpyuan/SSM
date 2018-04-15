package com.cn.zpy.service;

import java.util.List;

import com.cn.zpy.entity.Demo;

public interface DemoService {
	public void save(Demo demo);  
    
    public List<Demo> findAll();
}
