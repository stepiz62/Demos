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
@Table(name = "patient")
public class Patient implements ShrEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 1, max = 24)
	private String lastname;
	
	@Size(min = 1, max = 24)
	private String firstname;
	
	@NotNull
	private Boolean sex;
	
	@NotNull
	private Date dateofbirth;
	
	@NumberFormat(style = Style.PERCENT)
	private Double rate1;
	
	private BigDecimal currency1;
	
	@Basic(fetch=FetchType.LAZY)
	private byte[] image;
	
	private byte[] imagepreview;
	
	private byte[] document;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	public Double getRate1() {
		return rate1;
	}
	public void setRate1(Double rate1) {
		this.rate1 = rate1;
	}
	
	public BigDecimal getCurrency1() {
		return currency1;
	}
	public void setCurrency1(BigDecimal currency1) {
		this.currency1 = currency1;
	}
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public byte[] getImagepreview() {
		return imagepreview;
	}
	public void setImagepreview(byte[] imagepreview) {
		this.imagepreview = imagepreview;
	}
	
	public byte[] getDocument() {
		return document;
	}
	public void setDocument(byte[] document) {
		this.document = document;
	}
	
	@OneToMany(cascade = {CascadeType.REMOVE}, mappedBy="mypatient", orphanRemoval=true)
	private Set<Patientcustomer> patientcustomers = new HashSet<Patientcustomer>();
	
	public Set<Patientcustomer> getPatientcustomers() {
		return patientcustomers;
	}
	public void setPatientcustomers(Set<Patientcustomer> patientcustomers) {
		this.patientcustomers = patientcustomers;
	}
	
	@OneToMany(cascade = {CascadeType.REMOVE}, mappedBy="mypatient2", orphanRemoval=true)
	private Set<Clinicalcard> clinicalcards = new HashSet<Clinicalcard>();
	
	@Override
	public Vector<String> render() {
		Vector<String> retVal = new Vector<String>();
		retVal.add("lastname");
		retVal.add("firstname");
		retVal.add("dateofbirth");
		retVal.add("currency1");
		retVal.add("rate1");
		return retVal;
	}
	
}
