package com.example;

public abstract class Material {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;

    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true; // Por defecto, el material está disponible
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El material ha sido prestado.");
        } else {
            System.out.println("El material no está disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El material ha sido devuelto.");
        } else {
            System.out.println("El material ya está disponible.");
        }
    }

    public abstract String getTipoMaterial();
    public abstract double calcularTarifaPrestamo(int diasPrestamo);
}
