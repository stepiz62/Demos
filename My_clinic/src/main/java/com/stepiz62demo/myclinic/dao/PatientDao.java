package com.stepiz62demo.myclinic.dao;
import org.springframework.stereotype.Repository;

import com.sprhibrad.framework.dao.ShrDao;
import com.stepiz62demo.myclinic.model.Patient;

@Repository
public class PatientDao extends ShrDao<Patient> {
	@Override
	protected void update(Patient object, Patient objectInDb) {
		objectInDb.setLastname(object.getLastname());
		objectInDb.setFirstname(object.getFirstname());
		objectInDb.setSex(object.getSex());
		objectInDb.setDateofbirth(object.getDateofbirth());
		objectInDb.setRate1(object.getRate1());
		objectInDb.setCurrency1(object.getCurrency1());
	}
	
}
