package com.example.wap.models;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="authors")
public class Author {
  @Id
  private Integer id;
  private String name;
  private String biography;
  private Date birthday;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBiography() {
    return biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
