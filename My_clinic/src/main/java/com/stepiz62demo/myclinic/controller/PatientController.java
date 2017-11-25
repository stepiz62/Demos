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
import com.stepiz62demo.myclinic.model.Patient;
import com.stepiz62demo.myclinic.service.PatientcustomerService;
import com.stepiz62demo.myclinic.model.Patientcustomer;
import com.stepiz62demo.myclinic.service.ClinicalcardService;
import com.stepiz62demo.myclinic.model.Clinicalcard;

@Controller
public class PatientController extends ImplShrController<Patient> {
	
	@Autowired
	private IShrService<Patient> patientService;
	
	@Autowired
	private IShrService<Patientcustomer> patientcustomerService;
	
	@Autowired
	private IShrService<Clinicalcard> clinicalcardService;
	
	@Override
	protected IShrService<Patient> getService() {
		return patientService;
	}
	
	@Override
	protected Patient getEntityInstance() {
		return new Patient();
	}
	
	@RequestMapping(value = "/patient/add")
	public ModelAndView newObject(HttpServletRequest request, @RequestParam(required=false) String fk) {
		return super.newObject(request, fk);
	}
	
	@RequestMapping(value = "/patient/save")
	protected ModelAndView saveObject(@Valid Patient object, BindingResult result, HttpServletRequest request) {
		return super.saveObject(object, result, request);
	}
	
	@RequestMapping(value = "/patient/list/{iteration}")
	protected ModelAndView objectList(@PathVariable Integer iteration, Patient object, BindingResult result, HttpServletRequest request) {
		return super.objectList(iteration, object, result, request, new String[] {"imagepreview"});
	}
	
	@RequestMapping(value = "/patient/choices/{iteration}")
	protected ModelAndView objectSelectionList(@PathVariable Integer iteration, Patient object, BindingResult result, HttpServletRequest request, @RequestParam String targetMember) {
		return super.objectSelectionList(iteration, object, result, request, null, targetMember);
	}
	
	@RequestMapping(value="/patient/edit/{id}")
	protected ModelAndView editObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.editObject(id, request);
	}
	
	@RequestMapping(value="/patient/view/{id}")
	protected ModelAndView viewObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.viewObject(id, request, new String[] {"imagepreview"});
	}
	
	@RequestMapping(value="/patient/update/{id}")
	public ModelAndView updateObject(@Valid Patient object, BindingResult result, HttpServletRequest request) {
		return super.updateObject(object, result, request);
	}
	
	@RequestMapping(value="/patient/select/{id}")
	public String selectObject(@PathVariable Integer id, HttpServletRequest request, @RequestParam String targetMember) {
		return super.selectObject(id, request, targetMember);
	}
	
	@RequestMapping(value="/patient/delete/{id}")
	public String deleteObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.deleteObject(id, request);
	}
	
	@Override
	protected void addDetailsAttributes(ModelAndView modelAndView, Patient obj, HttpServletRequest request) {
		addDetailsAttribute("patientcustomers", patientcustomerService, "mycustomer", obj, modelAndView, request, "lastname", "asc", "mypatient", null);
		addDetailsAttribute("clinicalcards", clinicalcardService, null, obj, modelAndView, request, "number", "desc", "mypatient2", new String[] {"imagepreview"});
	}
	
	@Override
	protected void setListFilter(Patient entity, HttpServletRequest request) {
		addToFilter("lastname", entity.getLastname(), request);
	}
	
	@RequestMapping(value="/patient/uploadBinary")
	public ModelAndView uploadBinary(Patient object, @RequestParam String op, @RequestParam String pp, HttpServletRequest request) {
		return super.uploadBinary(object, op, pp, request);
	}
	
	@RequestMapping("/patient/doUploadBinary")
	public ModelAndView doUploadBinary(@RequestParam MultipartFile file, @RequestParam String op, @RequestParam String pp, HttpServletRequest request) {
		return super.doUploadBinary(file, op, pp, request);
	}
	
	@RequestMapping(value="/patient/deleteBinary")
	public ModelAndView deleteBinary(@RequestParam String op, @RequestParam String pp, HttpServletRequest request) {
		return super.deleteBinary(op, pp, request);
	}
	
	@ResponseBody
	@RequestMapping(value="/patient/{key}.{ext}")
	public byte[] getImage(@PathVariable String key, @PathVariable String ext) {
		return super.getImage(key, ext);
	}
	
	@RequestMapping("/patient/viewImage")
	public String viewImage(@RequestParam Integer id, @RequestParam String target, HttpServletRequest request) {
		return super.viewBinary(id, target, request, true);
	}
	
	@RequestMapping("/patient/viewHandout")
	public String viewHandout(@RequestParam String target, HttpServletRequest request) {
		return super.viewBinary(null, target, request, false);
	}
	
	@RequestMapping(value = "/patient/reports")
	protected void reportHandler(@RequestParam Map<String, String> map, HttpServletRequest request, HttpServletResponse response) {
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("lastname", map.get("lastname"));
		params.put("lastname_op", map.get("lastname" + Utils.operatorIdSuffix));
		params.put("orders", map.get("_iterResult-order"));
		params.put("orientations", map.get("_iterResult-orientation"));
		super.reportHandler(map, params, request, response);
	}
}
