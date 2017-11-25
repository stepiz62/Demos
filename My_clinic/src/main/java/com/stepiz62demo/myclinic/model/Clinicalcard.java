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
@Table(name = "clinicalcard")
public class Clinicalcard implements ShrEntity {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotNull
	private Integer number;
	
	private Date openingdate;
	
	private Date closingdate;
	
	@Size(min = 0, max = 255)
	private String note;
	
	@ClassSpecificDictionary
	@Basic(fetch=FetchType.LAZY)
	private byte[] image;
	
	@ClassSpecificDictionary
	private byte[] imagepreview;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Date getOpeningdate() {
		return openingdate;
	}
	public void setOpeningdate(Date openingdate) {
		this.openingdate = openingdate;
	}
	
	public Date getClosingdate() {
		return closingdate;
	}
	public void setClosingdate(Date closingdate) {
		this.closingdate = closingdate;
	}
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	
	@ManyToOne
	@JoinColumn(name = "mypatient2_id")
	private Patient mypatient2;
	
	public Patient getMypatient2() {
		return mypatient2;
	}
	public void setMypatient2(Patient mypatient2) {
		this.mypatient2 = mypatient2;
	}
	
	@Override
	public Vector<String> render() {
		Vector<String> retVal = new Vector<String>();
		retVal.add("number");
		return retVal;
	}
	
}
