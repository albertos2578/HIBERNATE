
package com.mycompany.aplicacionhibernate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

import models.pedidos;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class AplicacionHibernate {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Date  ar=new Date(System.currentTimeMillis());
        PedidosDAOHib a = new PedidosDAOHib();
        pedidos jde = new pedidos();
        jde.setCliente("jose");
        jde.setProducto_id(0);
        jde.setTime(ar);
        jde.setEstado("miau");
        jde = a.get(1);
         System.out.println(jde.getCliente());
         
    }
}
        //MensajeDAO gestorMensajes;     
        //gestorMensajes = new MensajeDAOHib();
//        Usuario u1 = gestorUsuarios.get(1);
//        Usuario u2 = gestorUsuarios.get(2);
//        
//        u1.send("Hola carabola", u2);
//        gestorUsuarios.update(u1);
//        gestorUsuarios.update(u2);
//        
//        System.out.println(u1);
//        System.out.println(u2);
        //       gestorUsuarios.delete(gestorUsuarios.get(1));
//        Mensaje m = new Mensaje();
//
//        m.setContent("Mensaje de prueba con hibernate");
//
//              
//        m.setFromUser( gestorUsuarios.get(1) );
//        m.setToUser( gestorUsuarios.get(2)  );
//        
//        gestorMensajes.save(m);
//
//        m.setContent("Mensaje de prueba con hibernate v2");       
//        gestorMensajes.update(m);
//        
        
    
    
     
    

