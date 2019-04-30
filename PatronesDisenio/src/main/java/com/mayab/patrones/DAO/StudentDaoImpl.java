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

public class StudentDaoImpl implements Dao {
	
   //list is working as a database
   List<User> students;

   public StudentDaoImpl(){
      students = new ArrayList<User>();
      Student student1 = new Student();
      Student student2 = new Student();
      Student student3 = new Student();
      Student student4 = new Student();
      Student student5 = new Student();
      Student student6 = new Student();
      
      students.add(student1);
      students.add(student2);
      students.add(student3);
      students.add(student4);
      students.add(student5);
      students.add(student6);
      
   }
   
    public void deleteUser(User student) {
      students.remove(student.getId());
      System.out.println("Student: id " + student.printS() + ", deleted from database");
    }


   //retrive list of students from the database
   
   public List<User> getAll() {
      return students;
   }

   
   public User getUser(int rollNo) {
      return students.get(rollNo);
   }


    public void updateUser(User student) {
        students.get(student.getId()).setName(student.getName());
      System.out.println("Student: id " + student.printS() + ", updated in the database");
    }

 }