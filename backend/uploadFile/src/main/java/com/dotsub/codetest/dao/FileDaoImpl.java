package com.dotsub.codetest.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
	
		String q = "insert into files(id,title,description,createdDate,filePath) values(:fid, :ftitle,:fdesc,:fcreateddate,:fpath)";
		Map<String, Object> namedParameters = new HashMap<String, Object>();		
		namedParameters.put("fid", 1);
		namedParameters.put("fdesc", f.getDescription());
		namedParameters.put("ftitle", f.getTitle());
		namedParameters.put("fcreateddate", f.getCreatedDate());
		namedParameters.put("fpath", f.getImagePath());
		
		namedParameterJdbcTemplate.update(q, namedParameters);
		
	}
}
