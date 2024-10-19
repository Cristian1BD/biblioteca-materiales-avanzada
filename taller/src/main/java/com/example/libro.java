package com.example;

public class libro extends Material{
    private String isbn;
    private int Numerodepaginas;

    public libro(String titulo, String autor, int añoPublicacion, String isbn, int numerodepaginas) {
        super(titulo, autor, añoPublicacion);
        this.isbn = isbn;
        this.Numerodepaginas = numerodepaginas;
    }
    
    @Override
    public String getTipoMaterial() {
        return "Libro";
    }
    
    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifa = 1.5;
        if (Numerodepaginas > 500) {
            tarifa += 0.05;
        }
        return tarifa * diasPrestamo;
    }
    public void mostrarDetallesDelLibro(){
        System.out.println(" ISBN " + isbn );
        System.out.println("Número de páginas " + Numerodepaginas );
    }
    
}
