package Ejercicio38_publicacionesAcademicas;

import java.util.List;

public class ArticuloIndexado extends PublicacionAcademica {
    private double factorImpacto;
    private String cuartil;

    public ArticuloIndexado(String titulo, String fechaPublicacion, List<String> autores, double factorImpacto, String cuartil) {
        super(titulo, fechaPublicacion, autores);
        this.factorImpacto = factorImpacto;
        this.cuartil = cuartil;
    }

    @Override
    public boolean validarIndexacion() {
        return factorImpacto > 0;
    }

    @Override
    public String generarCita() {
        return "[APA] " + super.generarCita() + " Revista indexada (FI " + factorImpacto + ", " + cuartil + ").";
    }
}
