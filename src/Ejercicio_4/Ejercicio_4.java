/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_4;
import java.util.Scanner;
/**
 *
 * @author israc
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        Empleado[] empleados = null;
        System.out.print("Ingrese el numero de empleados que desee registrar: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        do{
            System.out.println("====OPCIONES DE MENU====");
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Calculo de salario");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    empleados = new Empleado[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("===DATOS DEL EMPLEADO===");
                        System.out.print("Ingrese el nombre del empleado " + (i+1) + ": ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese las horas extras que ha realizado: ");
                        int horasExtras = sc.nextInt();
                        sc.nextLine();
                        empleados[i]= new Empleado(nombre, horasExtras);
                    }break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        empleados[i].calcularSalarioTotal();
                    }break;
                case 3: 
                    for (int i = 0; i < n; i++) {
                        empleados[i].mostrarDatos();
                    }break;
                case 4: break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    }
            
        }while(op!=4);
        sc.close();
    }
}