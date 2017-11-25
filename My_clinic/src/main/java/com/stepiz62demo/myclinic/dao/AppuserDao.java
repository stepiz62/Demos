package com.stepiz62demo.myclinic.dao;
import org.springframework.stereotype.Repository;

import com.sprhibrad.framework.dao.ShrDao;
import com.stepiz62demo.myclinic.model.Appuser;

@Repository
public class AppuserDao extends ShrDao<Appuser> {
	@Override
	protected void update(Appuser object, Appuser objectInDb) {
		objectInDb.setUsername(object.getUsername());
		objectInDb.setLastname(object.getLastname());
		objectInDb.setFirstname(object.getFirstname());
		objectInDb.setPassword(object.getPassword());
	}
	
}
