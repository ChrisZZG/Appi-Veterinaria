/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cutestvet.Persistencia;

import com.mycompany.cutestvet.Logica.Dog;
import com.mycompany.cutestvet.Logica.Owner;
import com.mycompany.cutestvet.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class ControladoraPersistencia {
    //INSTANCIAS Y VARIABLES GLOBALES
    DogJpaController dogJpa = new DogJpaController();
    OwnerJpaController ownerJpa = new OwnerJpaController();

    public void guardar(Owner owner, Dog dog) {
        //LLAMAMOS A LA INSTANCIA DE LA CONTROLADORA QUE CORRESPONDA Y LE DECIMOS
        //QUE GUARDE EL CORRESPONDIENTE PARAMETRO U OBJETO QUE ESTA ENTRANDO POR
        //EL METODO
        
        //GUARDAMOS AL OWNER EN OWNER JPA
        ownerJpa.create(owner);
        //GUARDAMOS AL DOG EN DOG JPA
        dogJpa.create(dog);

    }

    public List<Dog> findDogsEntities() {
        //LLAMAMOS A LA INSTANCIA DE DOG PARA QUE INGRESE A LA BASE DE DATOS 
        //Y TRAIGA LOS DATOS DE LOS CLIENTES
        return dogJpa.findDogEntities();
    }

    public void deleteDog(int idCliente) {
        try {
            dogJpa.destroy(idCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //TRAER MASCOTA PARA EDITAR
    public Dog findMascota(int idCliente) {
        return dogJpa.findDog(idCliente);
    }

    //EDITAR LA MASCOTA EN LA BASE DE DATOS
    public void modificarMascota(Dog dog) {
        try {
            dogJpa.edit(dog);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //TRAER AL DUEÑO DE LA BASE DE DATOS PARA PODER EDITAR
    public Owner traerDueño(int idOwner) {
        return ownerJpa.findOwner(idOwner);
    }

    //EDITAR AL DUEÑO EN LA BASE DE DATOS
    public void modificarDueño(Owner owner) {
        try {
            ownerJpa.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
