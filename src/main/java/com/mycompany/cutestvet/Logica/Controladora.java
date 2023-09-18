/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cutestvet.Logica;

import com.mycompany.cutestvet.Persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author crist
 */
public class Controladora {
    //INSTANCIAS Y VARIABLES GLOBALES
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String addresOwner, String breedDog, String colorDog, String nameDog,
            String nameOwner, String notesDog, String phoneOwner, String allergiesDog, String especAtenDog) {
        //AQUI CREAMOS UNA INSTANCIA DE DOG Y OTRA DE OWNER Y LE PASAMOS LOS PARAMETROS POR SETTEO
        //DE AQUELLO QUE ESTA ENTRANDO POR IMPUT Y SE ESTA PASANDO COMO PARAMETRO
        //DEL METODO
        
        //INSTANCIA DE OWNER
        Owner owner = new Owner();
        
        //SETTEAMOS SUS ATRIBUTOS
        owner.setAddressOwner(addresOwner);
        owner.setNameOwner(nameOwner);
        owner.setPhoneOwner(phoneOwner);
        
        //INSTANCIA DE DOG
        Dog dog = new Dog();
        //SETTEAMOS SUS ATRIBUTOS
        dog.setAllergicDog(allergiesDog);
        dog.setBreedDog(breedDog);
        dog.setColorDog(colorDog);
        dog.setEspAtDog(especAtenDog);
        dog.setNameDog(nameDog);
        dog.setNotesDog(notesDog);
        dog.setOwner(owner);
        
        //LLAMAMOS A LA CONTROLADORA DE LA PERSISTENCIA Y CREAMOS UN METODO LLAMADO
        //GUARDAR QUE TOME COMO PARAMETROS EL OWNER Y EL DOG QUE CREAMOS
        controlPersis.guardar(owner, dog);
    }

    public List<Dog> findDogsEntitites() {
        //LLAMAMOS A LA CONTROLADORA DE PERSISTENCIA PARA QUE LE PIDA A LA CONTROLADORA
        //DE PERSISTENCIA QUE ENCUENTRE EL METODO MAS ADECUADO PARA ACCEDER A LOS
        //DATOS CONTENIDOS EN LA BASE DE DATOS
        return controlPersis.findDogsEntities();
    }
    
    
    
}
