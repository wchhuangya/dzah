/**
 * 项目  dzah-biz 
 * 创建时间  2015-7-2 下午4:28:33 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.biz.modules.sys.service;

import java.util.List;

import com.ch.wchhuangya.dzah.entity.sys.SysUser;


/**
 * 类名: SysUserService <br/> 
 * 功能: 系统用户接口 <br/> 
 * 创建日期: 2015-7-2 下午4:28:33 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
public interface SysUserService {

	/**
	 * saveOrUpdate:新增/修改系统用户. 新增时主键为null，修改时主键不为null<br/> 
	 * 
	 * @author wchya 
	 * @param sysUser-要保存/修改的系统用户对象
	 * @throws Exception
	 */
	public void saveOrUpdate(SysUser sysUser) throws Exception;
	/**
	 * getAllList:获取所有用户列表. <br/> 
	 * 
	 * @author wchya 
	 * @return
	 * @throws Exception
	 */
	public List<SysUser> getAllList() throws Exception;
}
