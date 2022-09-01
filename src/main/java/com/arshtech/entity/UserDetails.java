
package com.arshtech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "USER_DETAILS")
public class UserDetails {

	

	/*
	 * @Column(name = "USER_ID") private Integer userId;
	 */
	@Id
	@Column(name = "USER_MOB")
	private String userMob;

	@Column(name = "USER_NAME")
	private String userName;

}
