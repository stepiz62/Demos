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
import com.stepiz62demo.myclinic.model.Patientcustomer;
import com.stepiz62demo.myclinic.service.CustomerService;
import com.stepiz62demo.myclinic.model.Customer;
import com.stepiz62demo.myclinic.service.PatientService;
import com.stepiz62demo.myclinic.model.Patient;

@Controller
public class PatientcustomerController extends ImplShrController<Patientcustomer> {
	
	@Autowired
	private IShrService<Patientcustomer> patientcustomerService;
	
	@Override
	protected IShrService<Patientcustomer> getService() {
		return patientcustomerService;
	}
	
	@Override
	protected Patientcustomer getEntityInstance() {
		return new Patientcustomer();
	}
	
	@RequestMapping(value = "/patientcustomer/add")
	public ModelAndView newObject(HttpServletRequest request, @RequestParam(required=false) String fk) {
		return super.newObject(request, fk);
	}
	
	@RequestMapping(value = "/patientcustomer/save")
	protected ModelAndView saveObject(@Valid Patientcustomer object, BindingResult result, HttpServletRequest request) {
		return super.saveObject(object, result, request);
	}
	
	@RequestMapping(value = "/patientcustomer/list/{iteration}")
	protected ModelAndView objectList(@PathVariable Integer iteration, Patientcustomer object, BindingResult result, HttpServletRequest request) {
		return super.objectList(iteration, object, result, request, null);
	}
	
	@RequestMapping(value = "/patientcustomer/choices/{iteration}")
	protected ModelAndView objectSelectionList(@PathVariable Integer iteration, Patientcustomer object, BindingResult result, HttpServletRequest request, @RequestParam String targetMember) {
		return super.objectSelectionList(iteration, object, result, request, null, targetMember);
	}
	
	@RequestMapping(value="/patientcustomer/edit/{id}")
	protected ModelAndView editObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.editObject(id, request);
	}
	
	@RequestMapping(value="/patientcustomer/view/{id}")
	protected ModelAndView viewObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.viewObject(id, request, null);
	}
	
	@RequestMapping(value="/patientcustomer/update/{id}")
	public ModelAndView updateObject(@Valid Patientcustomer object, BindingResult result, HttpServletRequest request) {
		return super.updateObject(object, result, request);
	}
	
	@RequestMapping(value="/patientcustomer/select/{id}")
	public String selectObject(@PathVariable Integer id, HttpServletRequest request, @RequestParam String targetMember) {
		return super.selectObject(id, request, targetMember);
	}
	
	@RequestMapping(value="/patientcustomer/delete/{id}")
	public String deleteObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.deleteObject(id, request);
	}
	
	@RequestMapping(value = "/patientcustomer/freeze/**")
	public String freezeObject(Patientcustomer object, @RequestParam String redir, @RequestParam String targetMember, @RequestParam String action,HttpServletRequest request) {
		return super.freezeObject(object, request, redir, targetMember, action);
	}
}
