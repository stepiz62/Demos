package com.stepiz62demo.myclinic.converter;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sprhibrad.framework.converter.VerboseLiteralConverter;
import com.sprhibrad.framework.service.IShrService;
import com.stepiz62demo.myclinic.service.StateService;
import com.stepiz62demo.myclinic.model.State;

@Component
public class StateConverter  extends VerboseLiteralConverter<State>{
	@Autowired
	IShrService<State> stateService;
	@Override
	protected State getObject(Serializable id) {
		return stateService.getObject(Integer.parseInt((String) id));
	}
}
