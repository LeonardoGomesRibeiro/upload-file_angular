package com.dotsub.codetest.controllers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dotsub.codetest.dao.FileDao;

@Controller
public class UploadFileController {
	
	List<com.dotsub.codetest.model.File> uploadedFiles = new LinkedList<com.dotsub.codetest.model.File>();
	
	@Autowired
	FileDao fileDao;
	
	@RequestMapping("/list")
	public ModelAndView listAll() {
		ModelAndView mav = new ModelAndView("index");
		
		return mav;
	}
	
	@RequestMapping("/upload")
	public ModelAndView upload() {
		ModelAndView mav = new ModelAndView("index");
		
		return mav;
	}
	
	@RequestMapping("/rest/allFiles")
	public @ResponseBody List<com.dotsub.codetest.model.File> getAllFiles(HttpServletRequest request) {
		return fileDao.getAll();
	}
	
	@RequestMapping("/rest/uploadFile")
	public @ResponseBody String upload(HttpServletRequest request) {
		try {
	        List<FileItem> multipart = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
	        String folder = "path";
	        String filename = "";
	        
	        com.dotsub.codetest.model.File file = new com.dotsub.codetest.model.File();	        
	        for (FileItem item : multipart) {
	        	file.setImagePath(folder + "/" + filename);
	        	file.setTitle(item.getName());
	        	if (!item.isFormField()) {
	                filename = new File(item.getName()).getName();
	                /*File file = new File(folder);
	                if (!file.exists()) {
	                    file.mkdir();
	                }
	                */
	            } else {
	            	if (item.getFieldName().equals("description")){
		        		file.setDescription(item.getString());	        		
		        	} else if (item.getFieldName().equals("createdDate")) {
		        		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");	        				        	
			        	file.setCreatedDate(new Date());
		        	}
	            }	        	
	        	//uploadedFiles.add(file);
				//item.write(new File(folder + "/" + filename));
	        	
				/*currentSession.persist(file);
		        currentSession.flush();*/
	        }
	        fileDao.insert(file);
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
		
		return "ok";
	}
}
