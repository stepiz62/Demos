package com.stepiz62demo.myclinic.dao;
import org.springframework.stereotype.Repository;

import com.sprhibrad.framework.dao.ShrDao;
import com.stepiz62demo.myclinic.model.Patientcustomer;

@Repository
public class PatientcustomerDao extends ShrDao<Patientcustomer> {
	@Override
	protected void update(Patientcustomer object, Patientcustomer objectInDb) {
		objectInDb.setMycustomer(object.getMycustomer());
		objectInDb.setMypatient(object.getMypatient());
		objectInDb.setIsthepatient(object.getIsthepatient());
		objectInDb.setRelationship(object.getRelationship());
	}
	
}
