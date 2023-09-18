/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cutestvet.Persistencia;

import com.mycompany.cutestvet.Logica.Dog;
import com.mycompany.cutestvet.Logica.Owner;
import java.util.List;

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
    
    
    
}
