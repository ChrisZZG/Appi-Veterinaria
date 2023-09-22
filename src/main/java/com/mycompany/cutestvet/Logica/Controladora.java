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

    public void borrar(int idCliente) {
        controlPersis.deleteDog(idCliente);
    }
    
    //TRAER MASCOTA PARA EDITAR
    public Dog findDog(int idCliente) {
        return controlPersis.findMascota(idCliente);
    }
    //BOTON PARA GUARDAR LO MODIFICADO
    public void modifyDog(Dog dog, String addresOwner, String breedDog, 
            String colorDog, String nameDog, String nameOwner, 
            String notesDog, String phoneOwner, String allergiesDog, 
            String especAtenDog) {
        
        /*SETTEAR LA MASCOTA ORIGINAL QUE PASAMOS COMO PARAMETRO
        CON LOS VALORES ENTRANTES DE LA EDICION
        */
        dog.setAllergicDog(allergiesDog);
        dog.setBreedDog(breedDog);
        dog.setColorDog(colorDog);
        dog.setEspAtDog(especAtenDog);
        dog.setNameDog(nameDog);
        dog.setNotesDog(notesDog);
        /*LE PASO A LA CONTROLADORA DE PERSISTENCIA LA MODIFICACION
        QUE TENDRA MASCOTA A TRAVES DE UN METODO INDEPENDENTE
        */
        controlPersis.modificarMascota(dog);
        /*PARA LOS DATOS DEL DUEÑO CREO UN METODO QUE ME TRAIGA EL DUEÑO
        A PARTIR DEL ID RELACIONADO Y A ESTE DUEÑO LE SETTEO LOS 
        VALORES Y LUEGO LO GUARDO
        USO THIS PARA QUE EL METODO ME LO CREE DENTRO DE LA MISMA 
        CLASE
        */
        
       Owner owner = this.buscarDueño(dog.getOwner().getIdOwner());
       
       /*UNA VEZ QUE EL METODO QUE CREE FUE A LA CONTROLADORA DE
       PERSISTENCIA Y TRAJO A LA PERSONA DUEÑO, LE SETTEO LOS VALORES
       */
       owner.setAddressOwner(addresOwner);
       owner.setNameOwner(nameOwner);
       owner.setPhoneOwner(phoneOwner);
       
       /*LLAMAR Y CREAR EL METODO MODIFICAR DUEÑO EN LA CONTROLADORA DE 
       PERSISTENCIA PARA QUE EL CAMBIO SE HAGA EN LA BASE DE DATOS
       USO THIS PARA QUE ME CREE EL METODO EN LA MISMA CONTROLADORA
       YA QUE A FUTURO PODRIA QUERER CREAR UNA MODIFICACION GENERAL
       QUE NO PASE POR ESTE TIPO DE EDICION
       */
       this.modificarDueño(owner);
        
    }

    private Owner buscarDueño(int idOwner) {
        return controlPersis.traerDueño(idOwner);
    }

    private void modificarDueño(Owner owner) {
        controlPersis.modificarDueño(owner);
    }
    
    
    
}
