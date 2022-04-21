/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios22.clases;

import com.google.common.base.Preconditions;

/**
 *
 * @author alumno
 */
public abstract class Pieza{
    private Posicion posicion;
    private final boolean Blanco;

    protected Pieza(Posicion posicion, boolean Blanco) {
        this.posicion = posicion;
        this.Blanco = Blanco;
    }

    public void setPosicion(Posicion p) {
        Preconditions.checkNotNull(p);
        this.posicion = p;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public boolean isBlanco() {
        return Blanco;
    }
    
    public boolean mover(Posicion p){
        Preconditions.checkNotNull(p);
        if(this.posicion == null){
            return false;
        }
        if(this.posicion.equals(p)){
            return false;
        }
        if (checkPieza(p)) {
            this.posicion = p;
            return true;
        }
        return false;
        
        
    }

    abstract public boolean checkPieza(Posicion p);   
    
    private boolean isPosicionDentro(Posicion p){
        return p.getX() >= 1 || p.getX() <= 8 && p.getY() >= 1 || p.getY() <= 8;
        
    }
    
    private static void checkPosicion(Number n) {
        Preconditions.checkArgument(n.doubleValue() >= 1 || n.doubleValue() <= 8);
    }     
    
    
}
