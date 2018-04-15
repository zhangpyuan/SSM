package com.cn.zpy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="t_demo")
public class Demo {

	@Id @GeneratedValue  
    private int id;  
    private String name;  
      
    public Demo() {  
        super();  
    }  
  
    public Demo(String name) {  
        super();  
        this.name = name;  
    }  
  
    public Demo(int id, String name) {  
        this.id = id;  
        this.name = name;  
    }  
  
    public long getId() {  
        return id;  
    }  
      
    @Column(name="demo_id")  
    public void setId(int id) {  
        this.id = id;  
    }  
      
    public String getName() {  
        return name;  
    }  
      
    @Column(name="demo_name")  
    public void setName(String name) {  
        this.name = name;  
    }     
	
}
