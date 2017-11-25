package com.stepiz62demo.myclinic.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sprhibrad.framework.model.VerboseLiteral;

@Entity
@Table(name = "country")
public class Country extends VerboseLiteral {
	
	@Id
	private Integer id;
	
	private String name;
	
	@Override
	public String literalField() {
		return "name";
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
}
