package com.ibm.userregister.infra.documents;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class UserDocument {
	@Id
	private String id;
	private String name;
	private String document;
	private String email;
	private AddressDocument address;
	private String mobile;
	private String gender;
	private Date birthdate;
	private String photo;
	private boolean active;
	private Date createdAt;
	private Date updateAi;
}
