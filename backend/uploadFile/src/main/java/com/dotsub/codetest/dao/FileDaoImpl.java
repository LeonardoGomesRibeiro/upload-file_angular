package com.dotsub.codetest.dao;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dotsub.codetest.model.File;

@Repository
public class FileDaoImpl implements FileDao {
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	public List<File> getAll() {
		List<File> files = new LinkedList<File>();
		File f = new File();
		f.setCreatedDate(new Date());
		f.setDescription("my description");
		f.setTitle("my title");
		files.add(f);
		return files;
	}
	public void insert(File f) {

	}

}
