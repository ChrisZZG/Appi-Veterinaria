/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cutestvet;

import com.mycompany.cutestvet.IGU.Principal;

/**
 *
 * @author crist
 */
public class CutestVet {

    public static void main(String[] args) {
        //INSTANCIA DE VISTA PRINCIPAL
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
}
