/**
 * 项目  dzah-biz 
 * 创建时间  2015-7-2 下午4:27:15 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.biz.modules.sys.dao;

import org.springframework.stereotype.Repository;

import com.ch.wchhuangya.dzah.biz.common.AbstractDao;
import com.ch.wchhuangya.dzah.entity.sys.SysUser;


/**
 * 类名: SysUserDao <br/> 
 * 功能: 系统用户数据访问对象 <br/> 
 * 创建日期: 2015-7-2 下午4:27:15 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@Repository("sysUserDao")
public class SysUserDao extends AbstractDao<SysUser, String> {

}
