package Ejercicio38_publicacionesAcademicas;

import java.util.List;

public class TesisDoctoral extends PublicacionAcademica {
    private String director;
    private String universidadOtorgante;

    public TesisDoctoral(String titulo, String fechaPublicacion, List<String> autores, String director, String universidadOtorgante) {
        super(titulo, fechaPublicacion, autores);
        this.director = director;
        this.universidadOtorgante = universidadOtorgante;
    }

    @Override
    public String generarCita() {
        return "[APA] " + getAutoresTexto() + " (" + getFechaPublicacion() + "). " + getTitulo()
                + " [Tesis doctoral, " + universidadOtorgante + "]. Director: " + director + ".";
    }
}
