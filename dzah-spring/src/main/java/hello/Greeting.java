/**
 * 项目  dzah-spring 
 * 创建时间  2015-6-24 上午10:42:51 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package hello;


/**
 * 类名: Greeting <br/> 
 * 功能: 问候实体 <br/> 
 * 创建日期: 2015-6-24 上午10:42:51 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
public class Greeting {

	private final long id;
	private final String content;
	
	public Greeting(long id, String content) {
	    this.id = id;
	    this.content = content;
	}
	
	public long getId() {
	    return id;
	}
	
	public String getContent() {
	    return content;
	}
}
