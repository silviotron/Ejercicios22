/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios22.clases.piezas;

import ejercicios22.clases.Pieza;
import ejercicios22.clases.Posicion;

/**
 *
 * @author alumno
 */
public class Peon extends Pieza{

    public Peon(Posicion posicion, boolean isBlanco) {
        super(posicion, isBlanco);
        checkPeon(posicion);
    }

    @Override
    public boolean checkPieza(Posicion p) {
        
        if (this.getPosicion().getX() != 0) {
            return false;
        }
        
        if (this.isBlanco()) {
            if(p.getY() == 1) {
                return false;
            }else if(this.getPosicion().getY() == 2) {
                
                if (p.getY() != 4 && p.getY() != 3) {
                    return false;
                }
            }else{
                
                if (p.getY() != this.getPosicion().getY() + 1) {
                    return false;
                }                
            }
        }else{
            if(p.getY() == 8) {
                return false;
            }else if (this.getPosicion().getY() == 7) {
                if (p.getY() != 6 && p.getY() != 5) {
                    return false;
                }
            }else{
                if (p.getY() != this.getPosicion().getY() - 1) {
                    return false;
                }                
            }           
        }
        
        return true;
    }
    
    private void checkPeon(Posicion p){
        if (this.isBlanco()) {
            if (this.getPosicion().getY() == 1) {
                throw new IllegalArgumentException("Posicion no valida para el Peón.");
            }
        }else{
            if (this.getPosicion().getY() == 8) {
                throw new IllegalArgumentException("Posicion no valida para el Peón.");
            }
        }
        
    }    
  
    
}
