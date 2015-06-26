/**
 * 项目  dzah-spring 
 * 创建时间  2015-6-24 下午10:25:46 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package hello;

import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 类名: DeviceDetctionController <br/> 
 * 功能: 检测访问设备类型的Controller <br/> 
 * 创建日期: 2015-6-24 下午10:25:46 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@Controller
public class DeviceDetctionController {

	@RequestMapping("/detect-device")
	public @ResponseBody String detectDevice(Device device){
		String deviceType = "unknown";
        if (device.isNormal()) {
            deviceType = "normal";
        } else if (device.isMobile()) {
            deviceType = "mobile";
        } else if (device.isTablet()) {
            deviceType = "tablet";
        }
        return "Hello " + deviceType + " browser!";
	}
}
