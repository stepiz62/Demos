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
import com.stepiz62demo.myclinic.model.Userrole;
import com.stepiz62demo.myclinic.service.RoleService;
import com.stepiz62demo.myclinic.model.Role;
import com.stepiz62demo.myclinic.service.AppuserService;
import com.stepiz62demo.myclinic.model.Appuser;

@Controller
public class UserroleController extends ImplShrController<Userrole> {
	
	@Autowired
	private IShrService<Userrole> userroleService;
	
	@Autowired
	private IShrService<Role> roleService;
	
	@Override
	protected IShrService<Userrole> getService() {
		return userroleService;
	}
	
	@Override
	protected Userrole getEntityInstance() {
		return new Userrole();
	}
	
	@Override
	protected void addEditingAttributes(ModelAndView modelAndView, Userrole obj) {
		modelAndView.addObject("roles", roleService.getObjects(null, null, null));
	}
	
	@RequestMapping(value = "/userrole/add")
	public ModelAndView newObject(HttpServletRequest request, @RequestParam(required=false) String fk) {
		return super.newObject(request, fk);
	}
	
	@RequestMapping(value = "/userrole/save")
	protected ModelAndView saveObject(@Valid Userrole object, BindingResult result, HttpServletRequest request) {
		return super.saveObject(object, result, request);
	}
	
	@RequestMapping(value = "/userrole/list/{iteration}")
	protected ModelAndView objectList(@PathVariable Integer iteration, Userrole object, BindingResult result, HttpServletRequest request) {
		return super.objectList(iteration, object, result, request, null);
	}
	
	@RequestMapping(value = "/userrole/choices/{iteration}")
	protected ModelAndView objectSelectionList(@PathVariable Integer iteration, Userrole object, BindingResult result, HttpServletRequest request, @RequestParam String targetMember) {
		return super.objectSelectionList(iteration, object, result, request, null, targetMember);
	}
	
	@RequestMapping(value="/userrole/edit/{id}")
	protected ModelAndView editObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.editObject(id, request);
	}
	
	@RequestMapping(value="/userrole/view/{id}")
	protected ModelAndView viewObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.viewObject(id, request, null);
	}
	
	@RequestMapping(value="/userrole/update/{id}")
	public ModelAndView updateObject(@Valid Userrole object, BindingResult result, HttpServletRequest request) {
		return super.updateObject(object, result, request);
	}
	
	@RequestMapping(value="/userrole/select/{id}")
	public String selectObject(@PathVariable Integer id, HttpServletRequest request, @RequestParam String targetMember) {
		return super.selectObject(id, request, targetMember);
	}
	
	@RequestMapping(value="/userrole/delete/{id}")
	public String deleteObject(@PathVariable Integer id, HttpServletRequest request) {
		return super.deleteObject(id, request);
	}
	
	@RequestMapping(value = "/userrole/freeze/**")
	public String freezeObject(Userrole object, @RequestParam String redir, @RequestParam String targetMember, @RequestParam String action,HttpServletRequest request) {
		return super.freezeObject(object, request, redir, targetMember, action);
	}
}
