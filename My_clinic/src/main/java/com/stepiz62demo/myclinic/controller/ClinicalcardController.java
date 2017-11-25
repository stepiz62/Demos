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
import com.stepiz62demo.myclinic.model.Clinicalcard;
import com.stepiz62demo.myclinic.service.PatientService;
import com.stepiz62demo.myclinic.model.Patient;

@Controller
public class ClinicalcardController extends ImplShrController<Clinicalcard> {
	
	@Autowired
	private IShrService<Clinicalcard> clinicalcardService;
	
	@Override
	protected IShrService<Clinicalcard> getService() {
		return clinicalcardService;
	}
	
	@Override
	protected Clinicalcard getEntityInstance() {
		return new Clinicalcard();
	}
	
	@RequestMapping(value = "/clinicalcard/add")
	public ModelAndView newObject(HttpServletRequest request, @RequestParam(required=false) String fk) {
		return super.newObject(request, fk);
	}
	
	@RequestMapping(value = "/clinicalcard/save")
	protected ModelAndView saveObject(@Valid Clinicalcard object, BindingResult result, HttpServletRequest request) {
		return super.saveObject(object, result, request);
	}
	
	@RequestMapping(value = "/clinicalcard/list/{iteration}")
	protected ModelAndView objectList(@PathVariable Integer iteration, Clinicalcard object, BindingResult result, HttpServletRequest request) {
		return super.objectList(iteration, object, result, request, new String[] {"imagepreview"});
	}
	
	@RequestMapping(value = "/clinicalcard/choices/{iteration}")
	protected ModelAndView objectSelectionList(@PathVariable Integer iteration, Clinicalcard object, BindingResult result, HttpServletRequest request, @RequestParam String targetMember) {
		return super.objectSelectionList(iteration, object, result, request, null, targetMember);
	}
	
	@RequestMapping(value="/clinicalcard/edit/{id}")
	protected ModelAndView editObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.editObject(id, request);
	}
	
	@RequestMapping(value="/clinicalcard/view/{id}")
	protected ModelAndView viewObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.viewObject(id, request, new String[] {"imagepreview"});
	}
	
	@RequestMapping(value="/clinicalcard/update/{id}")
	public ModelAndView updateObject(@Valid Clinicalcard object, BindingResult result, HttpServletRequest request) {
		return super.updateObject(object, result, request);
	}
	
	@RequestMapping(value="/clinicalcard/select/{id}")
	public String selectObject(@PathVariable Integer id, HttpServletRequest request, @RequestParam String targetMember) {
		return super.selectObject(id, request, targetMember);
	}
	
	@RequestMapping(value="/clinicalcard/delete/{id}")
	public String deleteObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.deleteObject(id, request);
	}
	
	@RequestMapping(value="/clinicalcard/uploadBinary")
	public ModelAndView uploadBinary(Clinicalcard object, @RequestParam String op, @RequestParam String pp, HttpServletRequest request) {
		return super.uploadBinary(object, op, pp, request);
	}
	
	@RequestMapping("/clinicalcard/doUploadBinary")
	public ModelAndView doUploadBinary(@RequestParam MultipartFile file, @RequestParam String op, @RequestParam String pp, HttpServletRequest request) {
		return super.doUploadBinary(file, op, pp, request);
	}
	
	@RequestMapping(value="/clinicalcard/deleteBinary")
	public ModelAndView deleteBinary(@RequestParam String op, @RequestParam String pp, HttpServletRequest request) {
		return super.deleteBinary(op, pp, request);
	}
	
	@ResponseBody
	@RequestMapping(value="/clinicalcard/{key}.{ext}")
	public byte[] getImage(@PathVariable String key, @PathVariable String ext) {
		return super.getImage(key, ext);
	}
	
	@RequestMapping("/clinicalcard/viewImage")
	public String viewImage(@RequestParam Integer id, @RequestParam String target, HttpServletRequest request) {
		return super.viewBinary(id, target, request, true);
	}
	
	@RequestMapping(value = "/clinicalcard/freeze/**")
	public String freezeObject(Clinicalcard object, @RequestParam String redir, @RequestParam String targetMember, @RequestParam String action,HttpServletRequest request) {
		return super.freezeObject(object, request, redir, targetMember, action);
	}
}
