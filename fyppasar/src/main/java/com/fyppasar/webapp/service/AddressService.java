/*package com.fyppasar.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService{
	 @Autowired
	  private AddressRepository addressRepository;

	 //return address list
	  public List<Address> listAll(){
	     return addressRepository.findAll();
	  }

	  public void save(Address address){
	      addressRepository.save(address);
	  }

	  public Address get(Long id){
	     return addressRepository.findById(id).get();
	  }

	//delete address by id
	  public void delete(Long id){
	      addressRepository.deleteByIdd(id);
	  }
}
 */