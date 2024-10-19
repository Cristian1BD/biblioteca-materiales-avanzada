package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        libro libro1 = new libro("Java para Principiantes", "Juan Pérez", 2022, "978-3-16-148410-0", 600);
        libro libro2 = new libro("La Programación Orientada a Objetos", "Maria López", 2018, "978-0-07-144088-7", 450);

        Revista revista1 = new Revista("Revista de Ciencia", "Carlos Sánchez", 2021, 10, "Enero");
        Revista revista2 = new Revista("Revista Tecnológica", "Elena García", 2023, 5, "Marzo");

        Audiovisual audiovisual1 = new Audiovisual("Documental sobre Java", "Luis Martínez", 2020, "DVD", 120);
        Audiovisual audiovisual2 = new Audiovisual("Película de ciencia ficción", "Ana Rodríguez", 2019, "Blu-ray", 150);

        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(libro2);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(revista2);
        biblioteca.agregarMaterial(audiovisual1);
        biblioteca.agregarMaterial(audiovisual2);

        System.out.println("Catálogo de la Biblioteca:");
        biblioteca.mostrarCatalogo();

        System.out.println("Buscando 'Revista Tecnológica':");
        Material encontrado = biblioteca.buscarMaterial("Revista Tecnológica");
        if (encontrado != null) {
            encontrado.mostrarInformacion();
        } else {
            System.out.println("Material no encontrado.");
        }

        System.out.println("Préstamo y devolución de materiales:");
        libro1.prestar();
        libro1.devolver();
        revista1.prestar();
        revista1.devolver();
        audiovisual1.prestar();
        audiovisual1.devolver();
    }
}