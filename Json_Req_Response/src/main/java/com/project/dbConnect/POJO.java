package com.project.dbConnect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)

public class POJO {

	@JsonProperty("@id")
	private String agreement_no;
	
	@JsonProperty("ZONE")
	private String zone;
	
	private String  ACTIVE_STATUS, WSO2_STATUS;
	
	public POJO() {
		 
    }

	public POJO(String id,String ZONE,String ACTIVE_STATUS,String WSO2_STATUS) {
		this.agreement_no=id;
		this.zone=ZONE;
		this.ACTIVE_STATUS=ACTIVE_STATUS;
		this.WSO2_STATUS=WSO2_STATUS;
	}
	
	public String getagreement_no() {
		return agreement_no;
	}

	public void setagreement_no(String aGREEMENT_NO) {
		agreement_no = aGREEMENT_NO;
	}

	public String getZONE() {
		return zone;
	}

	public void setZONE(String zONE) {
		zone = zONE;
	}

	public String getACTIVE_STATUS() {
		return ACTIVE_STATUS;
	}

	public void setACTIVE_STATUS(String aCTIVE_STATUS) {
		ACTIVE_STATUS = aCTIVE_STATUS;
	}

	public String getWSO2_STATUS() {
		return WSO2_STATUS;
	}

	public void setWSO2_STATUS(String wSO2_STATUS) {
		WSO2_STATUS = wSO2_STATUS;
	}


 
 


}

