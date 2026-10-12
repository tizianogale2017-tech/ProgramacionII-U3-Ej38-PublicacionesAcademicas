package Ejercicio38_publicacionesAcademicas;

import java.util.List;

public class PublicacionAcademica {
    private String titulo;
    private String fechaPublicacion;
    private List<String> autores;

    public PublicacionAcademica(String titulo, String fechaPublicacion, List<String> autores) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autores = autores;
    }

    public boolean validarIndexacion() {
        return false;
    }

    public String generarCita() {
        return String.join(", ", autores) + " (" + fechaPublicacion + "). " + titulo + ".";
    }

    protected String getTitulo() {
        return titulo;
    }

    protected String getFechaPublicacion() {
        return fechaPublicacion;
    }

    protected String getAutoresTexto() {
        return String.join(", ", autores);
    }
}
