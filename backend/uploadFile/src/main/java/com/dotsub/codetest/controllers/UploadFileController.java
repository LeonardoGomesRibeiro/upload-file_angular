package com.dotsub.codetest.controllers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
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
	
/*	@Autowired
	SessionFactory sessionFactory;
	
    private Session currentSession;*/
    
   /* @PostConstruct
    public void init(){
    	currentSession = sessionFactory.getCurrentSession();
    }*/
	@RequestMapping("/rest/uploadFile")
	public @ResponseBody String upload(HttpServletRequest request) {
		try {
	        List<FileItem> multipart = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
	        String folder = "path";
	        String filename = "";
	        Enumeration aNames = request.getAttributeNames();
	        while (aNames.hasMoreElements()) {
				Object object = (Object) aNames.nextElement();
				System.out.println("=== "+object);
			}
	        
	        Enumeration pNames = request.getParameterNames();
	        while (pNames.hasMoreElements()) {
				Object object = (Object) pNames.nextElement();
				System.out.println("000000 "+ object);
			}
	        for (FileItem item : multipart) {
	        	com.dotsub.codetest.model.File file = new com.dotsub.codetest.model.File();					        	
				
	        	file.setImagePath(folder + "/" + filename);
	        	if (!item.isFormField()) {
	                filename = new File(item.getName()).getName();
	                file.setTitle(filename);
	                /*File file = new File(folder);
	                if (!file.exists()) {
	                    file.mkdir();
	                }
	                */
	            } else {
	            	if (item.getFieldName().equals("description")){
		        		file.setDescription(item.getString());	        		
		        	} else if (item.getFieldName().equals("createdDate")) {
		        		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");	        	
			        	Date d = sdf.parse(item.getString());
			        	file.setCreatedDate(d);
		        	}
	            }
				//item.write(new File(folder + "/" + filename));
				
				
				/*currentSession.persist(file);
		        currentSession.flush();*/
	        }
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
		
		return "ok";
	}
}
