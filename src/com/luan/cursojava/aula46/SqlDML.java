/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luan.cursojava.aula46;

/**
 *
 * @author Luan
 */
public interface SqlDML {
    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);
}
