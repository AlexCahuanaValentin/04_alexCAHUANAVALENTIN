/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab04
 */
public class principal1 {
    	public static void main(String[] args){
		calculadora c1 = new calculadora();
		
                c1.IngresarDatos();
		
		c1.sumar();
		c1.restar();
		c1.multiplicaion();
		c1.division();
                
                c1.MostrarDatos();
	}
}

