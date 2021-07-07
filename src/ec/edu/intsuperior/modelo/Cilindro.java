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
public class Cilindro {
    
    
     private int area;
     private int base;
     
     
    //Constructor

    public Cilindro() {
    }

    public Cilindro(String TipoCilindro, int area, int base) {
        
        this.area = area;
        this.base = base;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }
     
 }