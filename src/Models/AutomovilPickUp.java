/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Salvador Solis Atenco
 */
public class AutomovilPickUp implements IAutomovil{

    @Override
    public void ordenarAuto(Automovil auto) {
        System.out.println("Se ordeno un auto tipo PickUp");
    }
    
}
