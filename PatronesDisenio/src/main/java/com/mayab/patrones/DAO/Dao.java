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
import java.util.List;

public interface Dao {
   public List<User> getAll();
   public User getUser(int id);
   public void updateUser(User student);
   public void deleteUser(User student);
}
