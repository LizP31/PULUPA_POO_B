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
public class Circulo {
    private int radio;
    private int diametro;
    
    
    //constructor

    public Circulo() {
    }

    public Circulo(int radio, int diametro, int centro) {
        this.radio = radio;
        this.diametro = diametro;
       
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDiametro() {
        return diametro;
    }
    
}
