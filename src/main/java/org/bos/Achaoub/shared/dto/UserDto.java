package org.bos.Achaoub.shared.dto;

import java.io.Serializable;

import lombok.Data;

public @Data class UserDto implements Serializable {

	private static final long serialVersionUID = -8593162992891859581L;
	private int id;
	private String userId;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private String encryptedPassword;
	private String emailVerifificationToken;
	private Boolean emailVerificationStatus = false;

}
