/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author LIZ
 */
public class Linea {
     private Punto p1;
     private Punto p2;
 //constructor

    public Linea() {
    }

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public Punto getP2() {
        return p2;
    }
     
            
}
