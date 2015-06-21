/**
 * 系统  综合办公开发平台-核心业务系统
 * 项目  dzah-util 
 * 创建时间  2015-6-20 下午8:59:03 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.util;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 类名: TimerHelper <br/> 
 * 功能: 日期助手类 <br/> 
 * 创建日期: 2015-6-20 下午8:59:03 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
public class TimerHelper {
	private static String CurrentTime;
	private static String CurrentDate;
	
	/**
	 * getCurrentDateTimeForFormat:根据指定日期格式输出当前日期时间的字符串. <br/> 
	 * 
	 * @author wchya 
	 * @param format-日期格式
	 * @return
	 */
	public static String getCurrentDateTimeForFormat(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(new Date());
	}
	/**
	 * getCurrentYear:获取当前日期中的年份. <br/> 
	 * 
	 * @author wchya 
	 * @return
	 */
	public static String getCurrentYear(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		return sdf.format(new Date());
	}
	/**
	 * getCurrentMonth:获取当前日期中的月份. <br/> 
	 * 
	 * @author wchya 
	 * @param model-月份模式。0-M；1-MM；
	 * @return
	 */
	public static String getCurrentMonth(int model){
		SimpleDateFormat sdf = new SimpleDateFormat(model == 0 ? "M" : "MM");
		return sdf.format(new Date());
	}
	/**
	 * getCurrentDay:获取当前日期中的日. <br/> 
	 * 
	 * @author wchya 
	 * @param model-日模式。0-d；1-dd；
	 * @return
	 */
	public static String getCurrentDay(int model){
		SimpleDateFormat sdf = new SimpleDateFormat(model == 0 ? "d" : "dd");
		return sdf.format(new Date());
	}
	/**
	 * getCurrentDay:获取当前日期中的小时. <br/> 
	 * 
	 * @author wchya 
	 * @param model-日模式。0-hh（12小时制）；1-HH（24小时制）；
	 * @return
	 */
	public static String getCurrentHour(int model){
		SimpleDateFormat sdf = new SimpleDateFormat(model == 0 ? "hh" : "HH");
		return sdf.format(new Date());
	}
	/**
	 * getCurrentDay:获取当前日期中的分钟. <br/> 
	 * 
	 * @author wchya 
	 * @param model-日模式。0-d；1-dd；
	 * @return
	 */
	public static String getCurrentMinute(){
		SimpleDateFormat sdf = new SimpleDateFormat("mm");
		return sdf.format(new Date());
	}
	/**
	 * getCurrentDay:获取当前日期中的秒数. <br/> 
	 * 
	 * @author wchya 
	 * @param model-日模式。0-d；1-dd；
	 * @return
	 */
	public static String getCurrentSecond(){
		SimpleDateFormat sdf = new SimpleDateFormat("ss");
		return sdf.format(new Date());
	}
	/**
	 * getCurrentDate:获取当前日期，格式：yyyy-MM-dd HH:mm:ss. <br/> 
	 * 
	 * @author wchya 
	 * @return
	 */
	public static String getCurrentDate(){
		return TimerHelper.getCurrentDateTimeForFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	public static void main(String[] args) {
		System.out.println(getCurrentDate());
	}
}
