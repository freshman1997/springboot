package com.yuan.cn.druid.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    @JsonIgnore
    private int id;
    @Column(name = "name")
    @JsonIgnore
    @JsonManagedReference
    private String username;
    @Column(name="email")
    @JsonManagedReference
    @JsonIgnore
    private String password;
}
