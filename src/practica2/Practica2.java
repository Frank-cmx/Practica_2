/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package practica2;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double p, pt = 0, pf;
        
        System.out.print("Ingrese la cantidad de prendas que adquirio: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el precio de la prenda " + (i + 1) + ": ");
            p = sc.nextDouble();
            pt = pt + p;
        }
        
        System.out.println("El subtotal es: " + pt);

        if (pt >= 300) {
            System.out.println("Aplica un descuento de 15%");
            pf = pt * 0.85;
        } else if (pt >= 200) {
            System.out.println("Aplica un descuento de 10%");
            pf = pt * 0.90;
        } else if (pt >= 100) {
            System.out.println("Aplica un descuento de 5%");
            pf = pt * 0.95;
        } else {
            System.out.println("No aplica descuento");
            pf = pt;
        }
        
        System.out.print("El precio final de pago es: " + pf);
        
        // Cerramos el scanner para evitar fugas de recursos
        sc.close();
    }
}
