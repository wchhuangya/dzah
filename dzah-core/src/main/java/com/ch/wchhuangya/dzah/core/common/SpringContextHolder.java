/**
 * 甘肃省精准扶贫平台
 * 项目  JZFP-core 
 * 创建时间  2015-6-14 下午04:10:23 
 * Copyright (c) 2015, 中国电信甘肃万维公司 All rights reserved.
 * 中国电信甘肃万维公司 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.core.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类名: SpringContextUtil <br/>
 * 功能: 获取spring容器，以访问容器中定义的其他Bean <br/>
 * 创建日期: 2014-3-22 下午7:47:28 <br/>
 * 
 * @author HT
 * @version V1.0
 * @since Jdk 1.6
 * @see
 * 
 */
public class SpringContextHolder implements ApplicationContextAware {

	private static ApplicationContext applicationContext; // Spring应用上下文环境

	/**
	 * 实现ApplicationContextAware接口的回调方法，设置上下文环境
	 * 
	 * @param applicationContext
	 * @throws BeansException
	 */
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringContextHolder.applicationContext = applicationContext;
	}

	/**
	 * @return ApplicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 从静态变量ApplicationContext中取得Bean, 自动转型为所赋值对象的类型.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		checkApplicationContext();
		return (T) applicationContext.getBean(name);
	}

	/**
	 * 从静态变量ApplicationContext中取得Bean, 自动转型为所赋值对象的类型.
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {
		checkApplicationContext();
		return (T) applicationContext.getBeansOfType(clazz);
	}

	private static void checkApplicationContext() {
		if (applicationContext == null) {
			String contexts[] = { "/applicationContext.xml","/applicationContext-core.xml" };
			applicationContext = new ClassPathXmlApplicationContext(contexts);
		}
	}

}
