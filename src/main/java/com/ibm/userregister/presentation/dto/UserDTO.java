package com.ibm.userregister.presentation.dto;

import java.util.Date;

import lombok.Data;

@Data

public class UserDTO {
		private Long id;
		private String name;
		private String document;
		private String email;
		private AddressDTO address;
		private String mobile;
		private String gender;
		private Date birthdate;
		private String photo;
		private boolean active;
		private Date createdAt;
		private Date updateAi;
		
	
}
