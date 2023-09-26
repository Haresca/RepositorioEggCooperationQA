/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author hesca
 */
public class Libro {
    // atributos de la clase
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor vacío de la clase
    public Libro() {
    }
    
    // Constructor con todos los atributos pasados por parámetro
    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de ISBN: ");
        isbn = scanner.nextLine();
        System.out.println("Ingrese el título del libro: ");
        titulo = scanner.nextLine();
        System.out.println("Ingrese el nombre del autor: ");
        autor = scanner.nextLine();
        System.out.println("Ingrese el número de páginas: ");
        numeroPaginas = scanner.nextInt();
    }

    // Método para informar los datos del libro
    public void informarLibro() {
        System.out.println("--- Datos del libro ---");
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }   
}
