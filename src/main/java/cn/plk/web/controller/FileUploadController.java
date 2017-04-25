/**
 * 创建日期 : 2017年1月11日
 * 修改历史 : 
 *     1. [2017年1月11日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.plk.bean.FileInfo;
import cn.plk.web.service.FileUploadService;

/**
 * Login Controller
 * @author {康培亮/AB052634}
 */

@Controller
@RequestMapping("/file")
public class FileUploadController {
	
	@Autowired
	private FileUploadService fileUploadService;

    @RequestMapping("/upload")
    public ModelAndView helloView (@RequestParam("files") MultipartFile[] files, HttpServletRequest request) {
    	String path = request.getSession().getServletContext().getRealPath("upload");
    	fileUploadService.uploadFiles(path, files);
        return new ModelAndView("index");
    }
    
    @RequestMapping("/list")
    public ModelAndView helloView (HttpServletRequest request) {
    	String path = request.getSession().getServletContext().getRealPath("upload");
    	List<FileInfo> fileInfoList = fileUploadService.getUploadFileInfo(path);
        return new ModelAndView("file/fileList", "fileInfoList", fileInfoList);
    }
}
