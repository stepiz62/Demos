package com.stepiz62demo.myclinic.dao;
import org.springframework.stereotype.Repository;

import com.sprhibrad.framework.dao.ShrDao;
import com.stepiz62demo.myclinic.model.Userrole;

@Repository
public class UserroleDao extends ShrDao<Userrole> {
	@Override
	protected void update(Userrole object, Userrole objectInDb) {
		objectInDb.setRoleid(object.getRoleid());
		objectInDb.setUserid(object.getUserid());
	}
	
}
