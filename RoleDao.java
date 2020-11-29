package com.example.wap.daos;

import com.example.wap.models.Role;
import com.example.wap.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RoleDao {
  @Autowired
  RoleRepository roleRepository;
  @GetMapping("/findAllRoles")
  public Iterable<Role> findAllUsers() {
    return roleRepository.findAll();
  }


  @GetMapping("/deleteRole/{role}")
  public void deleteRole(
          @PathVariable("role") Role role) {
    roleRepository.delete(role);
  }
  @GetMapping("/createRole")
  public Role createRole() {
    Role role = new Role();
    role.setRole("New Role");
    return roleRepository.save(role);
  }

}

