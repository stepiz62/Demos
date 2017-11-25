package com.stepiz62demo.myclinic.dao;
import org.springframework.stereotype.Repository;

import com.sprhibrad.framework.dao.ShrDao;
import com.stepiz62demo.myclinic.model.Clinicalcard;

@Repository
public class ClinicalcardDao extends ShrDao<Clinicalcard> {
	@Override
	protected void update(Clinicalcard object, Clinicalcard objectInDb) {
		objectInDb.setMypatient2(object.getMypatient2());
		objectInDb.setNumber(object.getNumber());
		objectInDb.setOpeningdate(object.getOpeningdate());
		objectInDb.setClosingdate(object.getClosingdate());
		objectInDb.setNote(object.getNote());
	}
	
}
