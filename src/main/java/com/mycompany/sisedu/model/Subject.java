/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Table(name="disciplina")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer registration;
    
    @Column(name="workload")
    private int workload;
    
    @Column(name="name")
    private int name;
    
    @Column(name="menu")
    private int menu;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_class",nullable=false)
    private Class classId;
    
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "fk_teacher",nullable=false)
    private Teacher teacher;

    public Integer getRegistration() {
        return registration;
    }

    public int getWorkload() {
        return workload;
    }

    public int getName() {
        return name;
    }

    public int getMenu() {
        return menu;
    }

    public Class getClassId() {
        return classId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setRegistration(Integer registration) {
        this.registration = registration;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setMenu(int menu) {
        this.menu = menu;
    }

    public void setClassId(Class classId) {
        this.classId = classId;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
