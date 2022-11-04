///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.aplicacionhibernate;
//
//import java.util.List;
//import models.Usuario;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.query.Query;
//
///**
// *
// * @author FranciscoRomeroGuill
// */
//public class UsuarioDAOHib implements UsuarioDAO {
//
//    @Override
//    public void save(Usuario u) {
//       Session s = HibernateUtil.getSessionFactory().openSession();
//            Transaction t = s.beginTransaction();
//            s.save(u);
//            t.commit();
//        }
//    
//
//    @Override
//    public void update(Usuario u) {
//       Session s = HibernateUtil.getSessionFactory().openSession();
//            Transaction t = s.beginTransaction();
//            s.update(u);
//            t.commit();
//        }
//    
//
//    @Override
//    public Usuario get(Integer id) {
//       Session s = HibernateUtil.getSessionFactory().openSession();
//            return s.get(Usuario.class,id);            
//        }
//    
//
//    @Override
//    public void delete(Usuario u) {
//        Session s = HibernateUtil.getSessionFactory().openSession();
//            Transaction t = s.beginTransaction();
//            s.delete(u);
//            t.commit();
//        }
//    
//
//    @Override
//    public List<Usuario> getAll() {
//        Session s = HibernateUtil.getSessionFactory().openSession();
//        Query q = s.createQuery("from Usuario");
//            return q.list();
//        }
//
//    }
//    
//
