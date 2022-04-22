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
    private static int movValidos = 0;
    private static int movInvalidos = 0;

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
    
    public boolean validarMovimiento(Posicion p){
        Preconditions.checkNotNull(p);
        if(this.posicion == null){
            return false;
        }
        if(this.posicion.equals(p)){
            return false;
        }
        return checkPieza(p);
        
        
    }
    public boolean mover(Posicion p){
        if (validarMovimiento(p)) {
            movValidos ++;
            this.posicion = p;
            return true;
        }else{
            movInvalidos ++;
            return false;
        }
        
    }
    public boolean mover(int x, int y){
        final Posicion p = new Posicion(x,y);
        if (validarMovimiento(p)) {
            movValidos ++;
            this.posicion = p;
            return true;
        }else{
            movInvalidos ++;
            return false;
        }
        
    }    
    
    
    abstract public String saludar();
    

    abstract protected boolean checkPieza(Posicion p);   
    
    private boolean isPosicionDentro(Posicion p){
        return p.getX() >= 1 || p.getX() <= 8 && p.getY() >= 1 || p.getY() <= 8;
        
    }
    
    private static void checkPosicion(Number n) {
        Preconditions.checkArgument(n.doubleValue() >= 1 || n.doubleValue() <= 8);
    }     
    
    
}
