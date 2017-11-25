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
@Table(name = "customer")
public class Customer implements ShrEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 0, max = 10)
	private String title;
	
	@Size(min = 1, max = 24)
	private String lastname;
	
	@Size(min = 1, max = 24)
	private String firstname;
	
	@Size(min = 1, max = 48)
	private String address;
	
	@Size(min = 1, max = 10)
	private String zipcode;
	
	@Size(min = 1, max = 32)
	private String city;
	
	@Size(min = 0, max = 48)
	private String email;
	
	@Size(min = 0, max = 20)
	private String mobilephone;
	
	@Size(min = 1, max = 32)
	private String taxcode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	
	public String getTaxcode() {
		return taxcode;
	}
	public void setTaxcode(String taxcode) {
		this.taxcode = taxcode;
	}
	
	@OneToMany(cascade = {CascadeType.REMOVE}, mappedBy="mycustomer", orphanRemoval=true)
	private Set<Patientcustomer> patientcustomers = new HashSet<Patientcustomer>();
	
	public Set<Patientcustomer> getPatientcustomers() {
		return patientcustomers;
	}
	public void setPatientcustomers(Set<Patientcustomer> patientcustomers) {
		this.patientcustomers = patientcustomers;
	}
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	private State state;
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	
	@Override
	public Vector<String> render() {
		Vector<String> retVal = new Vector<String>();
		retVal.add("lastname");
		retVal.add("firstname");
		return retVal;
	}
	
}
