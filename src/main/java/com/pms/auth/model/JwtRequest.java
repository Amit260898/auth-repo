package com.pms.auth.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;
	
	private String userName;
	private String password;
	
//	public JwtRequest() {
//		
//	}
//	
//	public JwtRequest(String userName, String password) {
//		super();
//		this.userName = userName;
//		this.password = password;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public static long getSerialversionuid() {
//		return serialVersionUID;
//	}
	
	
	
}