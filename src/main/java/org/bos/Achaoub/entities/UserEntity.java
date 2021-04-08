package org.bos.Achaoub.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "users")
@Data
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -4727713897942278288L;

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false)
	private String userId;

	@Column(nullable = false, length = 50)
	private String nom;

	@Column(nullable = false, length = 50)
	private String prenom;

	@Column(nullable = false, length = 120,unique=true)
	private String email;
	
	@Column(nullable = false)
	private String encryptedPassword;

	@Column(nullable = true)
	private String emailVerificationToken;

	//@Column(columnDefinition = "boolean default false")
	@Column(nullable = false)
	private Boolean emailVerificationStatus = false;

}
