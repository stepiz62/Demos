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
@Table(name = "patientcustomer")
public class Patientcustomer implements ShrEntity {
	
	@Id
	@GeneratedValue
	@Column(name="patcust_id")
	private Integer id;
	
	@NotNull
	private Boolean isthepatient;
	
	@Size(min = 0, max = 48)
	private String relationship;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Boolean getIsthepatient() {
		return isthepatient;
	}
	public void setIsthepatient(Boolean isthepatient) {
		this.isthepatient = isthepatient;
	}
	
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	@ManyToOne
	@JoinColumn(name = "mycustomer_id")
	private Customer mycustomer;
	
	public Customer getMycustomer() {
		return mycustomer;
	}
	public void setMycustomer(Customer mycustomer) {
		this.mycustomer = mycustomer;
	}
	
	@ManyToOne
	@JoinColumn(name = "mypatient_id")
	private Patient mypatient;
	
	public Patient getMypatient() {
		return mypatient;
	}
	public void setMypatient(Patient mypatient) {
		this.mypatient = mypatient;
	}
	
	@Override
	public Vector<String> render() {
		Vector<String> retVal = new Vector<String>();
		return retVal;
	}
	
}
