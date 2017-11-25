package com.stepiz62demo.myclinic.dao;
import org.springframework.stereotype.Repository;

import com.sprhibrad.framework.dao.ShrDao;
import com.stepiz62demo.myclinic.model.Customer;

@Repository
public class CustomerDao extends ShrDao<Customer> {
	@Override
	protected void update(Customer object, Customer objectInDb) {
		objectInDb.setState(object.getState());
		objectInDb.setCountry(object.getCountry());
		objectInDb.setTitle(object.getTitle());
		objectInDb.setLastname(object.getLastname());
		objectInDb.setFirstname(object.getFirstname());
		objectInDb.setAddress(object.getAddress());
		objectInDb.setZipcode(object.getZipcode());
		objectInDb.setCity(object.getCity());
		objectInDb.setEmail(object.getEmail());
		objectInDb.setMobilephone(object.getMobilephone());
		objectInDb.setTaxcode(object.getTaxcode());
	}
	
}
