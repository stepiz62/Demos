package com.stepiz62demo.myclinic.converter;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sprhibrad.framework.converter.VerboseLiteralConverter;
import com.sprhibrad.framework.service.IShrService;
import com.stepiz62demo.myclinic.service.RoleService;
import com.stepiz62demo.myclinic.model.Role;

@Component
public class RoleConverter  extends VerboseLiteralConverter<Role>{
	@Autowired
	IShrService<Role> roleService;
	@Override
	protected Role getObject(Serializable id) {
		return roleService.getObject(Integer.parseInt((String) id));
	}
}
