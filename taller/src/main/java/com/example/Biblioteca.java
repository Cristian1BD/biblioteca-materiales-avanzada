package com.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material != null && material.getTipoMaterial().equals(titulo)) {
                return material;
            }
        }
        return null; 
    }

    public void mostrarCatalogo() {
        for (Material material : materiales) {
            material.mostrarInformacion();
            if (material instanceof libro) {
                ((libro) material).mostrarDetallesDelLibro();
            } else if (material instanceof Revista) {
                ((Revista) material).mostrarDetallesRevista();
            } else if (material instanceof Audiovisual) {
                ((Audiovisual) material).mostrarDetallesAudiovisual();
            }
            System.out.println();
        }
    }
}