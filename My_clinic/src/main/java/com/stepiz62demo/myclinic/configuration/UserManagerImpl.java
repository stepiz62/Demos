package com.stepiz62demo.myclinic.configuration;

import com.stepiz62demo.myclinic.model.Appuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sprhibrad.framework.configuration.UserManager;
import com.sprhibrad.framework.service.IShrService;

public class UserManagerImpl implements UserManager{
	
	@Autowired
	private IShrService<Appuser> appuserService;
	@Override
	public String getUserEntityName() {
		return "appuser";
	}

	@Override
	public void createUserDDL(JdbcTemplate jdbcTemplate, String database, String userName, String password) {
		jdbcTemplate.execute(String.format("Create USER %s IDENTIFIED BY '%s'", userName, password));
		jdbcTemplate.execute(String.format("GRANT SELECT, INSERT, UPDATE, DELETE  ON %s.* TO '%s'@'%%'", database, userName));
	}

	@Override
	public String dropUserDDL() {
		return "DROP USER %s";
	}

	@Override
	public String changePasswordDDL() {
		return "SET PASSWORD FOR '%s'@'%' = PASSWORD('%s')";
	}

	@Override
	public String getPassword(Object entity) {
		return ((Appuser) entity).getPassword();
	}

	@Override
	public void setPassword(Object entity, String clearPwd) {
		((Appuser) entity).setPassword(clearPwd);
	}

	@Override
	public String getUsername(Object entity) {
		return ((Appuser) entity).getUsername();
	}

	@Override
	public IShrService getUserService() {
		return appuserService;
	}

	@Override
	public String getUserNameField() {
		return "username";
	}
	
	
}
