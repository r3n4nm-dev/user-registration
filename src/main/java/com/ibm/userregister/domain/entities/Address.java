package com.ibm.userregister.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Address {
	@Id
	private String id;
	private String zipCode;
	private String state;
	private String city;
	private String address;
	private String number;
	private String complement;
}
