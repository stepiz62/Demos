package com.stepiz62demo.myclinic.service;
import java.util.List;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhibrad.framework.dao.IShrDao;
import com.sprhibrad.framework.service.ShrService;
import com.stepiz62demo.myclinic.model.Customer;
import com.stepiz62demo.myclinic.dao.StateDao;
import com.stepiz62demo.myclinic.model.State;
import com.stepiz62demo.myclinic.dao.CountryDao;
import com.stepiz62demo.myclinic.model.Country;

@Service
@Transactional
public class CustomerService extends ShrService<Customer> {
	
	@Autowired
	private IShrDao<Customer> customerDao;
	
	@Override
	protected IShrDao<Customer> getDao() {
		return customerDao;
	}
	
}
