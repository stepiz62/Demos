package com.stepiz62demo.myclinic.service;
import java.util.List;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhibrad.framework.dao.IShrDao;
import com.sprhibrad.framework.service.ShrService;
import com.stepiz62demo.myclinic.model.Userrole;
import com.stepiz62demo.myclinic.dao.RoleDao;
import com.stepiz62demo.myclinic.model.Role;

@Service
@Transactional
public class UserroleService extends ShrService<Userrole> {
	
	@Autowired
	private IShrDao<Userrole> userroleDao;
	
	@Override
	protected IShrDao<Userrole> getDao() {
		return userroleDao;
	}
	
}
