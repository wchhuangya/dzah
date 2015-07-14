/**
 * 项目  dzah-spring 
 * 创建时间  2015-7-8 下午9:28:19 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 类名: Example <br/> 
 * 功能: spring boot的第一个例子 <br/> 
 * 创建日期: 2015-7-8 下午9:28:19 <br/> 
 *
 * @author Administrator
 * @since Jdk 1.6
 * @see       
 *
 */
@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String hello(){
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}
}
