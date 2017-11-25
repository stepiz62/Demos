package com.stepiz62demo.myclinic.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sprhibrad.framework.controller.ImplShrController;
import com.sprhibrad.framework.service.IShrService;
import com.sprhibrad.framework.common.Utils;
import com.stepiz62demo.myclinic.model.Customer;
import com.stepiz62demo.myclinic.service.StateService;
import com.stepiz62demo.myclinic.model.State;
import com.stepiz62demo.myclinic.service.CountryService;
import com.stepiz62demo.myclinic.model.Country;
import com.stepiz62demo.myclinic.service.PatientcustomerService;
import com.stepiz62demo.myclinic.model.Patientcustomer;

@Controller
public class CustomerController extends ImplShrController<Customer> {
	
	@Autowired
	private IShrService<Customer> customerService;
	
	@Autowired
	private IShrService<Patientcustomer> patientcustomerService;
	
	@Autowired
	private IShrService<State> stateService;
	
	@Autowired
	private IShrService<Country> countryService;
	
	@Override
	protected IShrService<Customer> getService() {
		return customerService;
	}
	
	@Override
	protected Customer getEntityInstance() {
		return new Customer();
	}
	
	@Override
	protected void addEditingAttributes(ModelAndView modelAndView, Customer obj) {
		modelAndView.addObject("states", stateService.getObjects(null, null, null));
		modelAndView.addObject("countries", countryService.getObjects(null, null, null));
	}
	
	@RequestMapping(value = "/customer/add")
	public ModelAndView newObject(HttpServletRequest request, @RequestParam(required=false) String fk) {
		return super.newObject(request, fk);
	}
	
	@RequestMapping(value = "/customer/save")
	protected ModelAndView saveObject(@Valid Customer object, BindingResult result, HttpServletRequest request) {
		return super.saveObject(object, result, request);
	}
	
	@RequestMapping(value = "/customer/list/{iteration}")
	protected ModelAndView objectList(@PathVariable Integer iteration, Customer object, BindingResult result, HttpServletRequest request) {
		return super.objectList(iteration, object, result, request, null);
	}
	
	@RequestMapping(value = "/customer/choices/{iteration}")
	protected ModelAndView objectSelectionList(@PathVariable Integer iteration, Customer object, BindingResult result, HttpServletRequest request, @RequestParam String targetMember) {
		return super.objectSelectionList(iteration, object, result, request, null, targetMember);
	}
	
	@RequestMapping(value="/customer/edit/{id}")
	protected ModelAndView editObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.editObject(id, request);
	}
	
	@RequestMapping(value="/customer/view/{id}")
	protected ModelAndView viewObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.viewObject(id, request, null);
	}
	
	@RequestMapping(value="/customer/update/{id}")
	public ModelAndView updateObject(@Valid Customer object, BindingResult result, HttpServletRequest request) {
		return super.updateObject(object, result, request);
	}
	
	@RequestMapping(value="/customer/select/{id}")
	public String selectObject(@PathVariable Integer id, HttpServletRequest request, @RequestParam String targetMember) {
		return super.selectObject(id, request, targetMember);
	}
	
	@RequestMapping(value="/customer/delete/{id}")
	public String deleteObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.deleteObject(id, request);
	}
	
	@Override
	protected void addDetailsAttributes(ModelAndView modelAndView, Customer obj, HttpServletRequest request) {
		addDetailsAttribute("patientcustomers", patientcustomerService, "mypatient", obj, modelAndView, request, "lastname,firstname", "desc,desc", "mycustomer", new String[] {"imagepreview"});
	}
	
	@Override
	protected void setListFilter(Customer entity, HttpServletRequest request) {
		addToFilter("lastname", entity.getLastname(), request);
		addToFilter("country", entity.getCountry(), request);
	}
	
	@ResponseBody
	@RequestMapping(value="/customer/{key}.{ext}")
	public byte[] getImage(@PathVariable String key, @PathVariable String ext) {
		return super.getImage(key, ext);
	}
	
	@RequestMapping("/customer/viewImage")
	public String viewImage(@RequestParam Integer id, @RequestParam String target, HttpServletRequest request) {
		return super.viewBinary(id, target, request, true);
	}
	
	@Override
	protected void shrInitBinder(WebDataBinder binder) {
		//binder.addValidators(....a validator......);;
	}
	
	@Override
	protected boolean validate(Customer object, BindingResult result) {
		boolean retVal = false;
		// if (....condition .....);
		//    result.rejectValue(....params......);;
		return retVal || super.validate(object, result);
	}
}
