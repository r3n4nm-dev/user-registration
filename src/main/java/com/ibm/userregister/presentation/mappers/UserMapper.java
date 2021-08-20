package com.ibm.userregister.presentation.mappers;

import com.ibm.userregister.domain.entities.Address;
import com.ibm.userregister.domain.entities.User;
import com.ibm.userregister.presentation.dto.AddressDTO;
import com.ibm.userregister.presentation.dto.UserDTO;

public interface UserMapper {

	User userDTOTOUser(UserDTO userDTO);
	
	UserDTO userTOUserDTO(User user);
	
	Address addressDTOTOaddress(AddressDTO addressDTO);
	
	AddressDTO addressTOAddressDTO(Address address);
	
	
	
}
