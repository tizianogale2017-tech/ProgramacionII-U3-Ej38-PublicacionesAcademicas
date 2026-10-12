package Ejercicio38_publicacionesAcademicas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PublicacionAcademica[] publicaciones = {
            new ArticuloIndexado("Redes neuronales en medicina", "2025", Arrays.asList("Gómez, L.", "Paz, R."), 4.2, "Q1"),
            new ActaCongreso("Optimización de rutas urbanas", "2024", Arrays.asList("Ruiz, M."), "Simposio Argentino de Informática", "Mendoza"),
            new TesisDoctoral("Modelos de aprendizaje federado", "2023", Arrays.asList("Sosa, T."), "Dra. Alicia Vera", "Universidad Nacional de Cuyo")
        };

        for (PublicacionAcademica p : publicaciones) {
            System.out.println("¿Indexada? " + p.validarIndexacion());
            System.out.println("  " + p.generarCita());
        }
    }
}
