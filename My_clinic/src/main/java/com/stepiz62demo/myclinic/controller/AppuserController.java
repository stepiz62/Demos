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
import com.stepiz62demo.myclinic.model.Appuser;
import com.stepiz62demo.myclinic.service.UserroleService;
import com.stepiz62demo.myclinic.model.Userrole;

@Controller
public class AppuserController extends ImplShrController<Appuser> {
	
	@Autowired
	private IShrService<Appuser> appuserService;
	
	@Autowired
	private IShrService<Userrole> userroleService;
	
	@Override
	protected IShrService<Appuser> getService() {
		return appuserService;
	}
	
	@Override
	protected Appuser getEntityInstance() {
		return new Appuser();
	}
	
	@RequestMapping(value = "/appuser/add")
	public ModelAndView newObject(HttpServletRequest request, @RequestParam(required=false) String fk) {
		return super.newObject(request, fk);
	}
	
	@RequestMapping(value = "/appuser/save")
	protected ModelAndView saveObject(@Valid Appuser object, BindingResult result, HttpServletRequest request) {
		return super.saveObject(object, result, request);
	}
	
	@RequestMapping(value = "/appuser/list/{iteration}")
	protected ModelAndView objectList(@PathVariable Integer iteration, Appuser object, BindingResult result, HttpServletRequest request) {
		return super.objectList(iteration, object, result, request, null);
	}
	
	@RequestMapping(value = "/appuser/choices/{iteration}")
	protected ModelAndView objectSelectionList(@PathVariable Integer iteration, Appuser object, BindingResult result, HttpServletRequest request, @RequestParam String targetMember) {
		return super.objectSelectionList(iteration, object, result, request, null, targetMember);
	}
	
	@RequestMapping(value="/appuser/edit/{id}")
	protected ModelAndView editObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.editObject(id, request);
	}
	
	@RequestMapping(value="/appuser/view/{id}")
	protected ModelAndView viewObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.viewObject(id, request, null);
	}
	
	@RequestMapping(value="/appuser/update/{id}")
	public ModelAndView updateObject(@Valid Appuser object, BindingResult result, HttpServletRequest request,
																@RequestParam(required=false) String oldPwd,
																@RequestParam(required=false) String currPwd,
																@RequestParam(required=false) String pwd2) {
		if (request.getParameter("currPwd") != null)
			super.checkPasswords(object, result, oldPwd, currPwd, pwd2, request);
		return super.updateObject(object, result, request);
	}
	
	@RequestMapping(value="/appuser/select/{id}")
	public String selectObject(@PathVariable Integer id, HttpServletRequest request, @RequestParam String targetMember) {
		return super.selectObject(id, request, targetMember);
	}
	
	@RequestMapping(value="/appuser/delete/{id}")
	public String deleteObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.deleteObject(id, request);
	}
	
	@Override
	protected void addDetailsAttributes(ModelAndView modelAndView, Appuser obj, HttpServletRequest request) {
		addDetailsAttribute("userroles", userroleService, "roleid", obj, modelAndView, request, "name", "asc", "userid", null);
	}
	
	@Override
	protected void setListFilter(Appuser entity, HttpServletRequest request) {
		addToFilter("lastname", entity.getLastname(), request);
		addToFilter("username", entity.getUsername(), request);
	}
}
