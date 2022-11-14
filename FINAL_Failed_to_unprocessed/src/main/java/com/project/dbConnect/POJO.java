package com.project.dbConnect;

import java.sql.Date;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)



@Data
public class POJO {

	
	@JsonProperty("@id")
	private String agreement_no;
	
	
	@JsonProperty("ZONE")
	private String zone;
	
	private String  activeStatus;
	

	private String  wso2Status;
	
	private Date STAMP;
	
	public POJO() {
		 
    }
	public POJO(String agreementno,String ZONE,String ACTIVE_STATUS,String WSO2_STATUS,Date STAMP) {
		this.agreement_no = agreementno;
		this.zone = ZONE;
		this.activeStatus = ACTIVE_STATUS;
		this.wso2Status = WSO2_STATUS;
		this.STAMP = STAMP;
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
		return activeStatus;
	}

	public void setACTIVE_STATUS(String aCTIVE_STATUS) {
		activeStatus = aCTIVE_STATUS;
	}

	public String getWSO2_STATUS() {
		return wso2Status;
	}

	public void setWSO2_STATUS(String wSO2_STATUS) {
		wso2Status = wSO2_STATUS;
	}
	public Date getSTAMP() {
		return STAMP;
	}
	public void setSTAMP(Date sTAMP) {
		STAMP = sTAMP;
	}


 
 


}

