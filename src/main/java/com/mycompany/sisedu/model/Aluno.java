/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sisedu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pedrohenrique
 */

@Entity
@Table(name="alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="registration_code")
    private int registration_code;
    
    @Column(name = "phone_number")
    private String phone_number;
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRegistrion_code() {
        return registration_code;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrion_code(int registrion_code) {
        this.registration_code = registrion_code;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    
}
