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
public class Torre extends Pieza{

    public Torre(Posicion posicion, boolean isBlanco) {
        super(posicion, isBlanco);
    }
    
    @Override
    public boolean checkPieza(Posicion p) {
        int difX = Math.abs(this.getPosicion().getX() - p.getX());
        int difY = Math.abs(this.getPosicion().getY() - p.getY());
        if (difX == 0 ^ difY == 0) {
            return true;
        }
        return false;
    }
    
    @Override
    public String saludar() {
        return "soy una Torre " + (this.isBlanco()?"Blanca":"Negra") + " Situada en la posicion " + this.getPosicion();
    }    
    
}
