package com.example.wap.models;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="accounts")

public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer number;
  private Date opened;
  private String state;
  private Integer item1;
  private Integer item2;
  private Integer item3;
  private Integer item4;
  private Integer item5;
private Integer libraryId;
  @ManyToOne
  @JsonIgnore
  private Library library;
  private Integer patronID;
  public Integer getNumber() {
    return number;
  }


  public Date getOpened() {
    return opened;
  }

  public void setOpened(Date opened) {
    this.opened = opened;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public int getItem1() {
    return item1;
  }

  public void setItem1(Integer item1) {
    this.item1 = item1;
  }
  public int getItem2() {
    return item2;
  }

  public void setItem2(Integer item2) {
    this.item2 = item2;
  }
  public int getItem3() {
    return item3;
  }

  public void setItem3(Integer item3) {
    this.item3 = item3;
  }
  public int getItem4() {
    return item4;
  }

  public void setItem4(Integer item4) {
    this.item4 = item4;
  }
  public int getItem5() {
    return item5;
  }

  public void setItem5(Integer item5) {
    this.item5 = item5;
  }

  public int getLibraryID() {
    return libraryId;
  }

  public void setLibraryID(Integer libraryID) {
    this.libraryId = libraryId;
  }

  public int getPatronID() {
    return patronID;
  }

  public void setPatronID(Integer patronID) {
    this.patronID = patronID;
  }
}

