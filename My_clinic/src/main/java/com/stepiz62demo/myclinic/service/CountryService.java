package com.stepiz62demo.myclinic.service;
import java.util.List;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhibrad.framework.dao.IShrDao;
import com.sprhibrad.framework.service.ShrService;
import com.stepiz62demo.myclinic.model.Country;

@Service
@Transactional
public class CountryService extends ShrService<Country> {
	
	@Autowired
	private IShrDao<Country> countryDao;
	
	@Override
	protected IShrDao<Country> getDao() {
		return countryDao;
	}
	
}
