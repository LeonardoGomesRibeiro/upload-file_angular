package com.dotsub.codetest.dao;

import java.util.List;

import com.dotsub.codetest.model.File;

public interface FileDao {

	List<File> getAll();
	
	void insert(File f);
}
