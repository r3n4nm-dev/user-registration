package com.ibm.userregister.infra.mappers;

import com.ibm.userregister.domain.entities.Address;
import com.ibm.userregister.domain.entities.User;
import com.ibm.userregister.infra.documents.AddressDocument;
import com.ibm.userregister.infra.documents.UserDocument;

public interface UserDocumentMapper {

	
	User userDocumentTOUser(UserDocument userDocument);
	
	UserDocument userTOUserDocument(User user);
	
	Address addressDocumentTOAddress(AddressDocument addressDocument);
	
	AddressDocument addressTOAddressDocument(Address address);
	
	
}
