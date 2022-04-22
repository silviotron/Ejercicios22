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
public class Caballo extends Pieza{

    public Caballo(Posicion posicion, boolean isBlanco) {
        super(posicion, isBlanco);
    }

    @Override
    protected boolean checkPieza(Posicion p) {
        int difX = Math.abs(this.getPosicion().getX() - p.getX());
        int difY = Math.abs(this.getPosicion().getY() - p.getY());
        if ((difX == 1 && difY == 2 )||(difX == 2 && difY == 1 ) ) {
            return true;
        }
        return false;
    }
  
    @Override
    public String saludar() {
        return "soy un Caballo " + (this.isBlanco()?"Blanco":"Negro") + " Situado en la posicion " + this.getPosicion();
    }    
    
}