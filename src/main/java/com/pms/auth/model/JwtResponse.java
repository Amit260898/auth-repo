package com.pms.auth.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;



@AllArgsConstructor
@Getter
public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String token;
	private String validity;
	
//	public JwtResponse(String token, String validity) {
//		super();
//		this.token = token;
//		this.validity = validity;
//	}
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
//	public String getToken() {
//		return token;
//	}
//	public String getValidity() {
//		return validity;
//	}
	
	


}