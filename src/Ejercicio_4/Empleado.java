/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_4;

/**
 *
 * @author israc
 */
public class Empleado {
    //Atrubutos
    String nombre;
    int horasExtras;
    double salarioBase;
    
    //Contructores

    public Empleado() {
    }

    public Empleado(String nombre, int horasExtras) {
        this.nombre = nombre;
        this.salarioBase = 460;
        this.horasExtras = horasExtras;
    }
    
    //metodos
    public void calcularSalarioTotal(){
        if (horasExtras > 0) {
            salarioBase = (horasExtras * 10) + salarioBase;
            System.out.println("El salario de " + nombre + " con las horas extra es de: " + salarioBase);
        }
    }
    public void mostrarDatos(){
        System.out.println("====DATOS DEL PERSONAL====");
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("El salario base del empleado es de $460 ");
        System.out.println("Las horas extras del empleado fueron de: " + horasExtras);
        System.out.println("Su salario incluida las horas extras es de: $" + salarioBase);
    }
}