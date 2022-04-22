/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios22.clases;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author alumno
 */
public class Tablero {
    private Map <Posicion, Pieza> tablero;

    public Tablero() {
        this.tablero = new LinkedHashMap<>();
    }
    
    public void add(Pieza p){
        if (isOcupada(p)) {
            this.tablero.put(p.getPosicion(), p);
        }
    }

    private boolean isOcupada(Pieza p) {
        return !this.tablero.containsKey(p.getPosicion());
    }
    
    public Pieza getPieza(int n){
        Preconditions.checkPositionIndex(n, this.tablero.size());
        int f = n;
        for (Pieza p : tablero.values()) {
            if(f == 0){
                return p;
            }
            f--;
        }
        throw new IndexOutOfBoundsException();
        
    }
    
    
    
    
}
