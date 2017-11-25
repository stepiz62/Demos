package com.stepiz62demo.myclinic.reports;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhibrad.framework.dao.IShrDao;
import com.sprhibrad.framework.service.ShrService;
import com.sprhibrad.framework.common.DataSetClauses;

import java.util.List;
import com.stepiz62demo.myclinic.model.Patient;

@Service
@Transactional
public class PatientReports  extends ShrService<Patient>   {
	
	@Autowired
	private IShrDao<Patient> patientDAO;
	
	@Override
	protected IShrDao<Patient> getDao() {
		return patientDAO;
	}
	
	public List<Patient> list(String criteria[], String criteria_op[], String orders, String orientations) {
		DataSetClauses clauses = new DataSetClauses();
		clauses.addCriterionForReport("lastname", criteria_op[0], criteria[0]);
		clauses.loadOrderClauses(orders, orientations);
		return super.getObjects(0, clauses, 0);
	}
}
