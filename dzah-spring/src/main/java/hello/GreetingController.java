/**
 * 项目  dzah-spring 
 * 创建时间  2015-6-24 上午10:44:52 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 类名: GreetingController <br/> 
 * 功能: 处理问题请求地址的Controller <br/> 
 * 创建日期: 2015-6-24 上午10:44:52 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
	    return new Greeting(counter.incrementAndGet(),
	                        String.format(template, name));
	}
}
