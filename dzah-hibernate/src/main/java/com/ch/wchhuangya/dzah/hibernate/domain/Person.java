/**
 * 项目  dzah-hibernate 
 * 创建时间  2015-7-4 下午9:55:15 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.hibernate.domain;

import java.util.HashSet;
import java.util.Set;


/**
 * 类名: Person <br/> 
 * 功能: 人员实体类 <br/> 
 * 创建日期: 2015-7-4 下午9:55:15 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@SuppressWarnings("rawtypes")
public class Person {

	private Long id;
	private int age;
	private String firstname;
	private String lastname;
	private Set events = new HashSet();
	private Set emailAddresses = new HashSet();
	
	public Person(){}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set getEvents() {
		return events;
	}

	public void setEvents(Set events) {
		this.events = events;
	}

	public Set getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(Set emailAddresses) {
		this.emailAddresses = emailAddresses;
	}
}
