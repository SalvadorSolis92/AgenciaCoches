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
public abstract class DecoradorEquipamiento implements IAutomovil {
    IAutomovil AutoDecorado;

    public DecoradorEquipamiento(IAutomovil AutoDecorado) {
        this.AutoDecorado = AutoDecorado;
    }
    
    @Override
    public abstract String ordenarAuto();
    
}
