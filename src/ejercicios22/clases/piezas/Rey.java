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
public class Rey extends Pieza{

    public Rey(Posicion posicion, boolean Blanco) {
        super(posicion, Blanco);
    }
    
    
    @Override
    protected boolean checkPieza(Posicion p) {
        int difX = Math.abs(this.getPosicion().getX() - p.getX());
        int difY = Math.abs(this.getPosicion().getY() - p.getY());
        if ((difX == 1 || difX == 0) && (difY == 1 || difY == 0)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String saludar() {
        return "soy un Rey " + (this.isBlanco()?"Blanco":"Negro") + " Situado en la posicion " + this.getPosicion();
    }    
    
}
