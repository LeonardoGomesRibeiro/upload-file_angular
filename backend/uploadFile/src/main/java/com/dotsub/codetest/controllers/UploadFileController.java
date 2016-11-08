package com.dotsub.codetest.controllers;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UploadFileController {
	
	@Autowired
	SessionFactory sessionFactory;
	
    private Session currentSession;
    
    @PostConstruct
    public void init(){
    	currentSession = sessionFactory.getCurrentSession();
    }
	@RequestMapping("/rest/uploadFile")
	public @ResponseBody String upload(HttpServletRequest request) {
		try {
	        List<FileItem> multipart = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
	        String folder = "path";
	        String filename = "";
	        for (FileItem item : multipart) {
	            if (!item.isFormField()) {
	                filename = new File(item.getName()).getName();
	                File file = new File(folder);
	                if (!file.exists()) {
	                    file.mkdir();
	                }
	            }
				item.write(new File(folder + "/" + filename));
				
				com.dotsub.codetest.model.File file = new com.dotsub.codetest.model.File();
				file.setCreatedDate(new Date());
				file.setTitle(filename);
				file.setDescription("my description");
				file.setImagePath(folder + "/" + filename);
				
				currentSession.persist(file);
		        currentSession.flush();
	        }
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
		
		return "ok";
	}
}
