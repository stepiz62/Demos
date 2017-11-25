package com.stepiz62demo.myclinic.model;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.sprhibrad.framework.model.ClassSpecificDictionary;
import com.sprhibrad.framework.model.ShrEntity;
import com.sprhibrad.framework.model.VerboseLiteral;

@Entity
@Table(name = "userrole")
public class Userrole implements ShrEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "roleid")
	private Role roleid;
	
	public Role getRoleid() {
		return roleid;
	}
	public void setRoleid(Role roleid) {
		this.roleid = roleid;
	}
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private Appuser userid;
	
	public Appuser getUserid() {
		return userid;
	}
	public void setUserid(Appuser userid) {
		this.userid = userid;
	}
	
	@Override
	public Vector<String> render() {
		Vector<String> retVal = new Vector<String>();
		return retVal;
	}
	
}
