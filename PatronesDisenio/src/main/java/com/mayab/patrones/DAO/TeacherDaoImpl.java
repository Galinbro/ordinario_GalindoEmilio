/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.DAO;

/**
 *
 * @author galindo
 */
import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements Dao {
	
   //list is working as a database
   ArrayList<User> teacher;

   public TeacherDaoImpl(){
      teacher = new ArrayList<User>();
      Teacher teacher1 = new Teacher();
      Teacher teacher2 = new Teacher();
      Teacher teacher3 = new Teacher();
      
      teacher.add(teacher1);
      teacher.add(teacher2);
      teacher.add(teacher3);
      
   }
   
   public void deleteUser(User t) {
      teacher.remove(t.getId());
      System.out.println("Student: id " + t.printS() + ", deleted from database");
   }

   //retrive list of students from the database
   
   public List<User> getAll() {
      return teacher;
   }

   
   public User getUser(int rollNo) {
      return teacher.get(rollNo);
   }

    public void updateUser(User t){
         teacher.get(t.getId()).setName(t.getName());
        System.out.println("Student: id " + t.printS() + ", updated in the database");
    }

    
    //setters getter 
    
    
}
