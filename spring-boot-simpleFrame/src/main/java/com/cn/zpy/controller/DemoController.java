package com.cn.zpy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.zpy.entity.Demo;
import com.cn.zpy.service.DemoService;


@RequestMapping(value="/demo")
@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value="/save")
	public String save(){
		Demo demo=new Demo("xixi");
		demoService.save(demo);
		
		return "success";
	}
	
	@RequestMapping(value="/list")
	public Map<String,Object> list(){
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("data", demoService.findAll());
		
		return map;
		
		
	}
}
