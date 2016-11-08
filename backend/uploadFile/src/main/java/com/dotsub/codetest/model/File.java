package com.dotsub.codetest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class File {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column
	    private long id;
	 	
	 	@Column(length = 50, nullable = false)
	    private String title;
	 	
	 	@Column(length = 200, nullable = true)
	    private String description;
	 	
	 	@Column()
	 	@DateTimeFormat(pattern="MM-dd-yyyy hh:ss:mm")
	 	private Date createdDate;
	 	
	 	@Column()
	 	private String imagePath;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}

		public String getImagePath() {
			return imagePath;
		}

		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}
	 	
	 	
}
