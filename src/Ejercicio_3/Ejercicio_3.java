/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int op ;
        Libro lib[] = null;
        System.out.print("Cuantos libros desea ingresar: ");
        int n = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("\nSISTEMA DE GESTION DE LIBROS");
            System.out.println("1. Ingreso de libros");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar datos");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch (op){
                case 1 :
                    lib = new Libro[n]; //se definio un objeto array, se esta conteniendo a varios libros
                    for (int i = 0; i < n; i++) {
                        System.out.println("Datos libro " + (i+1) + ":");
                        System.out.println("Titulo: ");
                        String titulo = sc.nextLine();
                        System.out.println("Autor: ");
                        String autor = sc.nextLine();
                        System.out.println("Paginas: ");
                        String paginas = sc.nextLine();
                        System.out.println("Estado (disponible/prestado/extraviado): ");
                        String estado = sc.nextLine();
                        
                        lib[i] = new Libro(titulo, autor, paginas, estado);
                    }
                    break;

                case 2:
                    if (lib != null) {
                        for (int i = 0; i < n; i++) {
                            if (lib[i] != null) {
                                lib[i].prestar();
                            }
                        }
                    } else {
                        System.out.println("Primero debe ingresar los libros (Opcion 1).");
                    }
                    break;

                case 3:
                    if (lib != null) {
                        for (int i = 0; i < n; i++) {
                            if (lib[i] != null) {
                                lib[i].devolver();
                            }
                        }
                    } else {
                        System.out.println("Primero debe ingresar los libros (Opcion 1).");
                    }
                    break;

                case 4: 
                    if (lib != null) {
                        for (int i = 0; i < n; i++) {
                            if (lib[i] != null) {
                                lib[i].mostrarInfo();
                            }
                        }
                    } else {
                        System.out.println("Primero debe ingresar los libros (Opcion 1).");
                    }
                    break;
            }
        
        } while(op != 5);
        
        sc.close();
    }
    
}