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
import javax.persistence.OneToOne;

/**
 *
 * @author crist
 */
@Entity
public class Dog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDog;
    @Basic
    private String nameDog;
    private String breedDog;
    private String colorDog;
    private String allergicDog;
    private String espAtDog;
    private String notesDog;
    @OneToOne
    private Owner owner;

    public Dog() {
    }

    public Dog(int idDog, String nameDog, String breedDog, String colorDog, String allergicDog, String espAtDog, String notesDog, Owner owner) {
        this.idDog = idDog;
        this.nameDog = nameDog;
        this.breedDog = breedDog;
        this.colorDog = colorDog;
        this.allergicDog = allergicDog;
        this.espAtDog = espAtDog;
        this.notesDog = notesDog;
        this.owner = owner;
    }

    public int getIdDog() {
        return idDog;
    }

    public void setIdDog(int idDog) {
        this.idDog = idDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public String getBreedDog() {
        return breedDog;
    }

    public void setBreedDog(String breedDog) {
        this.breedDog = breedDog;
    }

    public String getColorDog() {
        return colorDog;
    }

    public void setColorDog(String colorDog) {
        this.colorDog = colorDog;
    }

    public String getAllergicDog() {
        return allergicDog;
    }

    public void setAllergicDog(String allergicDog) {
        this.allergicDog = allergicDog;
    }

    public String getEspAtDog() {
        return espAtDog;
    }

    public void setEspAtDog(String espAtDog) {
        this.espAtDog = espAtDog;
    }

    public String getNotesDog() {
        return notesDog;
    }

    public void setNotesDog(String notesDog) {
        this.notesDog = notesDog;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
}
