/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios22;

import ejercicios22.clases.Posicion;
import ejercicios22.clases.Tablero;
import ejercicios22.clases.piezas.*;

/**
 *
 * @author alumno
 */
public class Ejercicios22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tablero t = new Tablero();
        t.add(new Caballo(new Posicion(2,1), true));//0
        t.add(new Alfil(new Posicion(1,1), true));//1
        t.add(new Torre(new Posicion(1,8), false));//2
        t.add(new Peon(new Posicion(2,2), true));//3
        t.add(new Peon(new Posicion(2,7), false));//4
        t.add(new Reina(new Posicion(4,1), false));//5
        t.add(new Rey(new Posicion(5,1), false));//6
        System.out.println("0");
        System.out.println((t.getPieza(0).mover(3,2)?"si":"no"));
        System.out.println((t.getPieza(0).mover(3,3)?"si":"no"));
        
        System.out.println("1");
        System.out.println((t.getPieza(1).mover(4,3)?"si":"no"));
        System.out.println((t.getPieza(1).mover(4,4)?"si":"no"));
        
        System.out.println("2");
        System.out.println((t.getPieza(2).mover(3,4)?"si":"no"));
        System.out.println((t.getPieza(2).mover(4,8)?"si":"no"));
        
        System.out.println("3");
        System.out.println((t.getPieza(3).mover(3,4)?"si":"no"));
        System.out.println((t.getPieza(3).mover(2,4)?"si":"no"));
        
        System.out.println("5");
        System.out.println((t.getPieza(5).mover(1,5)?"si":"no"));
        System.out.println((t.getPieza(5).mover(1,4)?"si":"no"));
        
        System.out.println("6");
        System.out.println((t.getPieza(6).mover(4,4)?"si":"no"));
        System.out.println((t.getPieza(6).mover(4,2)?"si":"no"));
        
        
    }
    
}
