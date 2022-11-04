/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author FranciscoRomeroGuill
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name="pedidos")
public class pedidos implements Serializable {

    public pedidos() {
        time = new Date();
    }
    
    @Id
    @GeneratedValue(strategy=IDENTITY)
    private Integer producto_id;
    
    @Column(name="cliente")
    private String cliente;
    
    @Column(name="estado")
    private String estado;

    
     @Column(name="fecha")
    private Date time;
    
  

    @Override
    public String toString() {
        return "pedidos{" + "producto_id=" + producto_id + ", cliente=" + cliente + ", estado=" + estado + ", time=" + time + '}';
    }
    
 
    
    
}
