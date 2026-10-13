/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author Usuario
 */
public class Libro {
    // Atributos
    String titulo, autor, paginas, estado;

    public Libro() {
    }

    public Libro(String titulo, String autor, String paginas, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.estado = estado;
    }

    // Metodos
    public void prestar() {
        if (estado.equalsIgnoreCase("disponible")) {
            estado = "prestado";
            System.out.println("Libro '" + titulo + "' prestado con éxito.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible.");
        }
    }

    public void devolver() {
        if (estado.equalsIgnoreCase("prestado")) {
            estado = "disponible";
            System.out.println("Libro '" + titulo + "' regresado con éxito.");
        } else {
            System.out.println("El libro '" + titulo + "' no se encuentra prestado.");
        }
    }

    public void mostrarInfo() {
        System.out.println("==== MOSTRAR DATOS =====");
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("paginas: " + paginas);
        System.out.println("estado: " + estado);
    }
}