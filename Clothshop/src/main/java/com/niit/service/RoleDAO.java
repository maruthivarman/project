package com.niit.service;

import java.util.List;

import com.niit.model.Role;

public interface RoleDAO {
	public List<Role> getAllRoles();
	 public Role getRole(int roleid);
	 public void insertRole(Role role);
	 public void updateRole(Role role);
	 public void deleteRole(int id);
	 public void deleteAllRole(Role role);
}
