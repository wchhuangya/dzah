/**
 * 项目  dzah-entity 
 * 创建时间  2015-7-2 上午11:11:43 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.entity.sys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * 类名: SysUser <br/> 
 * 功能: 系统用户实体 <br/> 
 * 创建日期: 2015-7-2 上午11:11:43 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@Entity
@Table(name = "sys_user")
public class SysUser implements Serializable {

	private static final long serialVersionUID = 5948496300000815121L;
	
	@Id
	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@GeneratedValue(generator = "generator")
	@Column(name = "user_id", length = 32)
	private String userId;
	
	@Column(name = "user_name", length = 64, nullable = true)
	private String userName;

	public SysUser() {
		super();
	}

	public SysUser(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
