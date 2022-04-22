/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios22.clases;

import com.google.common.base.Preconditions;
import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Posicion implements Comparable<Posicion>{
    private int x;
    private int y;

    public Posicion(int x, int y) {
        check1y8(x);
        check1y8(y);
        this.x = x;
        this.y = y;
    }     
    
    private static void check1y8(Number n) {
        Preconditions.checkArgument(n.doubleValue() >= 1 || n.doubleValue() <= 8);
    }     

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (obj instanceof Posicion) {
            Posicion aux = (Posicion) obj;
            return this.x == aux.x && this.y == aux.y;
        } else {
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Posicion p) {
        Preconditions.checkNotNull(p);
        if(Integer.compare(this.x, p.x) != 0){
            return Integer.compare(this.x, p.x);
        }else{
            return Integer.compare(this.y, p.y);
        }
        
    }
    
    
    
}
