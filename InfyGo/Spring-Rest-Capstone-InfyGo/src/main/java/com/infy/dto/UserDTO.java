package com.infy.dto;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class UserDTO {
	
	private String userId;
	@NotNull(message = "{user.city.null}")
	@NotBlank(message = "{user.city.blank}")
	private String city;
	@NotNull(message = "{user.email.null}")
	@NotBlank(message = "{user.email.blank}")
	private String email;
	@NotNull(message = "{user.name.null}")
	@NotBlank(message = "{user.name.blank}")
	private String name;
	@NotNull(message = "{user.password.null}")
	@NotBlank(message = "{user.password.blank}")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{9,20}$", message = "{user.password.invalid}")
	private String password;
	@NotNull(message = "{user.phone.null}")
	@NotBlank(message = "{user.phone.blank}")
	private String phone;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(String userId,
			@NotNull(message = "{user.city.null}") @NotBlank(message = "{user.city.blank}") String city,
			@NotNull(message = "{user.email.null}") @NotBlank(message = "{user.email.blank}") String email,
			@NotNull(message = "{user.name.null}") @NotBlank(message = "{user.name.blank}") @NotNull(message = "{user.password.null}") @NotBlank(message = "{user.password.blank}") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{9,20}$", message = "{user.password.invalid}") String password,
			@NotNull(message = "{user.phone.null}") @NotBlank(message = "{user.phone.blank}") String phone) {
		super();
		this.userId = userId;
		this.city = city;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDTO other = (UserDTO) obj;
		return Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", city=" + city + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + "]";
	}

}
