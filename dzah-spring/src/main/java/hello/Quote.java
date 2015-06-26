/**
 * 项目  dzah-spring 
 * 创建时间  2015-6-25 上午11:43:08 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package hello;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * 类名: Quote <br/> 
 * 功能: 报价实体 <br/> 
 * 创建日期: 2015-6-25 上午11:43:08 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Quote {

	private String type;
	private Value value;
}
