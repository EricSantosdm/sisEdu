package com.mycompany.sisedu.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author pedrohenrique
 */
@Entity
@Table(name="administrador")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    
    @Column(name="name")
    private int name;
    
    @Column(name="email")
    private int email;
    
    @Column(name="password")
    private int password;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_school",nullable=false)
    private School school;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Integer getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public int getEmail() {
        return email;
    }

    public int getPassword() {
        return password;
    }

    public School getSchool() {
        return school;
    }
    
}
