package com.ibm.userregister.infra.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class AddressDocument {
	@Id
	private String id;
	private String zipCode;
	private String state;
	private String city;
	private String address;
	private String number;
	private String complement;
}
