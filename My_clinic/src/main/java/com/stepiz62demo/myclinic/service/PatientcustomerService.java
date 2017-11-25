package com.stepiz62demo.myclinic.service;
import java.util.List;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhibrad.framework.dao.IShrDao;
import com.sprhibrad.framework.service.ShrService;
import com.stepiz62demo.myclinic.model.Patientcustomer;

@Service
@Transactional
public class PatientcustomerService extends ShrService<Patientcustomer> {
	
	@Autowired
	private IShrDao<Patientcustomer> patientcustomerDao;
	
	@Override
	protected IShrDao<Patientcustomer> getDao() {
		return patientcustomerDao;
	}
	
}
