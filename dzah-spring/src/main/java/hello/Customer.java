/**
 * 项目  dzah-spring 
 * 创建时间  2015-6-25 下午1:00:53 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package hello;

import lombok.Data;


/**
 * 类名: Customer <br/> 
 * 功能: 客户自定义类 <br/> 
 * 创建日期: 2015-6-25 下午1:00:53 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@Data
public class Customer {

	private long id;
	private String firstName, lastName;
}
