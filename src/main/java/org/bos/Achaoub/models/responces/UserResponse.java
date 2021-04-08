package org.bos.Achaoub.models.responces;

import lombok.Data;

public @Data class UserResponse {

	private int id;
	private String userId;
	private String nom;
	private String prenom;
	private String email;

	public UserResponse() {

	}

	public UserResponse(String nom, String prenom ,String email,String userId) {
		this.nom = nom;
		this.prenom=prenom;
		this.email = email;
		this.userId  = userId;
	}

}
