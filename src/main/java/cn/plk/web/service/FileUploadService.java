/**
 * 
 */
package cn.plk.web.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cn.plk.bean.FileInfo;

/**
 * @author {康培亮/AB052634}
 *
 */
@Service
public class FileUploadService {

	public void uploadFiles(String path, MultipartFile[] files) {
		for (MultipartFile multifile : files) {
			uploadFile(path, multifile);
		}
	}

	private void uploadFile(String path, MultipartFile multifile) {
		String fileName = multifile.getOriginalFilename();
		
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}

		// 保存
		try {
			multifile.transferTo(targetFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<FileInfo> getUploadFileInfo(String directory) {
		File directoryFile = new File(directory);
		if (!directoryFile.exists() || !directoryFile.isDirectory()) {
			
		}
		List<FileInfo> fileInfoList = new ArrayList<FileInfo>();
		File[] childFiles = directoryFile.listFiles();
		for(File child : childFiles) {
			FileInfo fileInfo = new FileInfo();
			fileInfo.setName(child.getName());
			fileInfo.setSize(child.length());
			fileInfoList.add(fileInfo);
		}
		return fileInfoList;
	}
}
