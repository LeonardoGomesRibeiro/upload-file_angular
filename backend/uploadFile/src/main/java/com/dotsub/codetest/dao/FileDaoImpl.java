package com.dotsub.codetest.dao;

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
		// TODO Auto-generated method stub
		return null;
	}

}
