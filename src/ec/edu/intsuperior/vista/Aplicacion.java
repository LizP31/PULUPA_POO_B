/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;


import ec.edu.intsuperior.modelo.Punto;
import java.util.Scanner;
/**
 *
 * @author LIZ
 */
public class Aplicacion {
    
   public static void main(String[] args){ 
       
       Scanner imput=new Scanner(System.in);
        Punto p1=new Punto(5,7);
        Punto p2=new Punto(0,0);
        System.out.println("Ingrese el valor del punto 1");
        p2.setX(imput.nextInt());
        p2.setY(imput.nextInt());
        
        System.out.println("la distancia entre dos puntos son"+p1.distanciaEntreDosPuntos(p1.getX(),p2.getX(),p1.getY(),p2.getY()));
         
       
   }
}
