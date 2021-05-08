package com.mycompany.sisedu;

import com.mycompany.sisedu.controller.TeacherController;
import com.mycompany.sisedu.model.Teacher;

/**
 *
 * @author pedrohenrique
 */
public class Teste {
    public static void main (String[] args) {
        Teacher teacher = new Teacher();
        TeacherController teacherController = new TeacherController();
        
        teacher.setName("Ray this man");
        teacher.setEmail("É o fraco");
        teacher.setPassword("password");
        
        teacherController.save(teacher);
        
    } 
}
