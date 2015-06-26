/**
 * 项目  dzah-spring 
 * 创建时间  2015-6-26 下午3:25:44 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package hello;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


/**
 * 类名: FileUploadController <br/> 
 * 功能: 文件上传控制器 <br/> 
 * 创建日期: 2015-6-26 下午3:25:44 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@Controller
public class FileUploadController {

	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public @ResponseBody String provideUploadInfo(){
		return "You can upload a file by posting to this same URL";
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String handleFileUpload(@RequestParam("name") String name,
            @RequestParam("file") MultipartFile file){
        if (!file.isEmpty()) {
        	if(StringUtils.isNotBlank(name)){System.out.println(".................");
	            try {
	                byte[] bytes = file.getBytes();
	                BufferedOutputStream stream =
	                        new BufferedOutputStream(new FileOutputStream(new File("D:/" + name)));
	                stream.write(bytes);
	                stream.close();
	                return "You successfully uploaded " + name + "!";
	            } catch (Exception e) {
	                return "You failed to upload " + name + " => " + e.getMessage();
	            }
        	} else {
        		return "You must input the name of file!";
        	}
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    }
}
