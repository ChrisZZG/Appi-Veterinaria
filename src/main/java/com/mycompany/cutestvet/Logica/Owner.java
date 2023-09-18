/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cutestvet.Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author crist
 */
@Entity
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idOwner;
    @Basic
    private String nameOwner;
    private String phoneOwner;
    private String addressOwner;

    public Owner() {
    }

    public Owner(int idOwner, String nameOwner, String phoneOwner, String addressOwner) {
        this.idOwner = idOwner;
        this.nameOwner = nameOwner;
        this.phoneOwner = phoneOwner;
        this.addressOwner = addressOwner;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getPhoneOwner() {
        return phoneOwner;
    }

    public void setPhoneOwner(String phoneOwner) {
        this.phoneOwner = phoneOwner;
    }

    public String getAddressOwner() {
        return addressOwner;
    }

    public void setAddressOwner(String addressOwner) {
        this.addressOwner = addressOwner;
    }
    
    
    
    
}
