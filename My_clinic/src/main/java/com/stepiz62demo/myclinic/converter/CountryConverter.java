package com.stepiz62demo.myclinic.converter;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sprhibrad.framework.converter.VerboseLiteralConverter;
import com.sprhibrad.framework.service.IShrService;
import com.stepiz62demo.myclinic.service.CountryService;
import com.stepiz62demo.myclinic.model.Country;

@Component
public class CountryConverter  extends VerboseLiteralConverter<Country>{
	@Autowired
	IShrService<Country> countryService;
	@Override
	protected Country getObject(Serializable id) {
		return countryService.getObject(Integer.parseInt((String) id));
	}
}
