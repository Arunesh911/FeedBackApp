
package com.arshtech.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "FEEDBACK")
public class Feedback {

	@Id
	@Column(name = "MOBILE_NO")
	private String mobileNo;
	
	@Column(name = "SERVICE_RESPONSE")
	private String  serviveResp;

	@Column(name = "SERVICE_PROCESS")
	private String serviceProcess;
	@Column(name="SELF_SATISFACTION")
	private String selfSatisfactionRating;
	
	
	@Column(name= "RATING")
	private Integer rating;
	
	@Column(name = "RESP_TIME")
	private String respTime;
	
	
	
	@Column(name= "SUGGESTION")
	private String suggestion;
	
}
