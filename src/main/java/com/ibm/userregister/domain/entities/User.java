package com.ibm.userregister.domain.entities;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class User {
	@Id
	private String id;
	private String name;
	private String document;
	private String email;
	private Address address;
	private String mobile;
	private String gender;
	private Date birthdate;
	private String photo;
	private boolean active;
	private Date createdAt;
	private Date updateAi;
	
}
