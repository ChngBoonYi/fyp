package com.fyppasar.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fyppasar.webapp.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>  {

	
	Role findByRoleName(String roleName);
	
}
