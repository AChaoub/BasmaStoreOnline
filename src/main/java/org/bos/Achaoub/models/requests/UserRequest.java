package org.bos.Achaoub.models.requests;

import lombok.Data;

public @Data class UserRequest {

	private int id;
	private String userId;
	private String nom;
	private String prenom;
	private String email;
	private String password;

	public UserRequest() {

	}

	public UserRequest(String nom, String prenom ,String email,String userId,String password) {
		this.nom = nom;
		this.prenom=prenom;
		this.email = email;
		this.userId = userId;
		this.password= password;
	}

}
