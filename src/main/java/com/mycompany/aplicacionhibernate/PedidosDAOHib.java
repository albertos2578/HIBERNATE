/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplicacionhibernate;

import models.pedidos;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class PedidosDAOHib implements PedidosDAO {

    @Override
    public void save(pedidos m) {
        Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            s.save(m);
            t.commit();
            s.close();
        }
    

    @Override
    public void update(pedidos m) {
       Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            s.update(m);
            t.commit();
            s.close();
        }
    

    @Override
    public pedidos get(Integer id) {
        pedidos ara = new pedidos();
        Session s = HibernateUtil.getSessionFactory().openSession();
        ara=s.get(pedidos.class, id);
        s.close();
            return ara;
           
        }
    

    @Override
    public void delete(pedidos m) {
       Session s = HibernateUtil.getSessionFactory().openSession();
            Transaction t = s.beginTransaction();
            s.remove(m);
            t.commit();
             s.close();
        }
    }
    

