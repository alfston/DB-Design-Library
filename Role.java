package com.example.wap.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String role;


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}
