package com.social.ws.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull(message= "{social.constarint.username.NotNull.message}")
	@Size(min=4, max=255)
	@UniqueUsername(message= "{social.constarint.username.UniqueUsername.message}")
	private String username;
	
	@NotNull
	@Size(min=4, max=255)
	private String displayName;

	@NotNull
	@Pattern(regexp=".{8,}", message= "{social.constarint.password.Pattern.message}")
	private String password;
}
