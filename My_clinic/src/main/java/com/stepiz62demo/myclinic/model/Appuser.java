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
import com.sprhibrad.framework.model.UserTable;;

@Entity
@Table(name = "appuser")
public class Appuser implements ShrEntity, UserTable {
	
	@Size(min = 0, max = 30)
	private String username;
	
	@Size(min = 0, max = 20)
	private String lastname;
	
	@Size(min = 0, max = 20)
	private String firstname;
	
	@Size(min = 0, max = 100)
	private String password;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@OneToMany(cascade = {CascadeType.REMOVE}, mappedBy="userid", orphanRemoval=true)
	private Set<Userrole> userroles = new HashSet<Userrole>();
	
	public Set<Userrole> getUserroles() {
		return userroles;
	}
	public void setUserroles(Set<Userrole> userroles) {
		this.userroles = userroles;
	}
	
	@Override
	public Vector<String> render() {
		Vector<String> retVal = new Vector<String>();
		retVal.add("username");
		retVal.add("lastname");
		retVal.add("firstname");
		return retVal;
	}
	
}
