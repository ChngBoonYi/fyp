package com.fyppasar.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="auth_role")
public class Role {

	@Id
	@Column(name="auth_role_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long authRoleId;
	
	private String roleName;
	
	public Role() {}
	
	public Role(String roleName) {
		this.roleName=roleName;
	}
	
	public Long getAuthRoleId() {
		return authRoleId;
	}

	public void setAuthRoleId(Long authRoleId) {
		this.authRoleId = authRoleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Role{" + "authRoleId=" + authRoleId +
				", roleName='" + roleName + '\'' + '}';
	}
	
	
}
