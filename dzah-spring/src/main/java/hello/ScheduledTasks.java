/**
 * 项目  dzah-spring 
 * 创建时间  2015-6-24 下午7:46:39 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * 类名: ScheduledTasks <br/> 
 * 功能: 定时任务 <br/> 
 * 创建日期: 2015-6-24 下午7:46:39 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@Component
public class ScheduledTasks {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "3/2 * * * * *")
    public void reportCurrentTime() {
        System.out.println("The time is now " + dateFormat.format(new Date()));
    }
}
