/**
 * 系统  综合办公开发平台-核心业务系统
 * 项目  dzah-util 
 * 创建时间  2015-6-20 下午8:55:40 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.util;

import java.net.InetAddress;

import org.hibernate.id.IdentifierGenerator;


/**
 * 类名: UUIDGenerator <br/> 
 * 功能: UUID生成器 <br/> 
 * 创建日期: 2015-6-20 下午8:55:40 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
public abstract class UUIDGenerator implements IdentifierGenerator {
	
	private static final int IP;
	static {
		int ipadd;
		try {
			ipadd = BytesHelper.toInt(InetAddress.getLocalHost().getAddress() );
		}
		catch (Exception e) {
			ipadd = 0;
		}
		IP = ipadd;
	}
	private static short counter = (short) 0;
	private static final int JVM = (int) ( System.currentTimeMillis() >>> 8 );
	
	public UUIDGenerator() {
	}
	
	/**
	 * Unique across JVMs on this machine (unless they load this class
	 * in the same quater second - very unlikely)
	 */
	protected int getJVM() {
		return JVM;
	}
	
	/**
	 * Unique in a millisecond for this JVM instance (unless there
	 * are > Short.MAX_VALUE instances created in a millisecond)
	 */
	protected short getCount() {
		synchronized(UUIDGenerator.class) {
			if (counter<0) counter=0;
			return counter++;
		}
	}
	
	/**
	 * Unique in a local network
	 */
	protected int getIP() {
		return IP;
	}
	
	/**
	 * Unique down to millisecond
	 */
	protected short getHiTime() {
		return (short) ( System.currentTimeMillis() >>> 32 );
	}
	protected int getLoTime() {
		return (int) System.currentTimeMillis();
	}
}