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
public class calculadora {

    int num1;
    int num2;
    double sum, rest, mult, div;

    public void sumar() {
        sum = num1 + num2;
    }

    public void restar() {
        rest = num1 - num2;
    }

    public void multiplicaion() {
        mult = num1 * num2;
    }

    public void division() {
        div = num1 / num2;
    }

    public void IngresarDatos() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
    }
    public void MostrarDatos() {
        JOptionPane.showMessageDialog(null,"La Suma es "+sum+"\nLa Resta es "+rest+"\nLa Multiplicacion es "+mult+"\nLa Division es "+div);
    }
}
