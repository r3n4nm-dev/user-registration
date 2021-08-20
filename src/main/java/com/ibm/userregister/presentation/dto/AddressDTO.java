package com.ibm.userregister.presentation.dto;

import lombok.Data;

@Data
public class AddressDTO {
	private String id;
	private String zipCode;
	private String state;
	private String city;
	private String address;
	private String number;
	private String complement;
}