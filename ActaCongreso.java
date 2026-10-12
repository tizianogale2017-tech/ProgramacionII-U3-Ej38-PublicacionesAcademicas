package Ejercicio38_publicacionesAcademicas;

import java.util.List;

public class ActaCongreso extends PublicacionAcademica {
    private String simposio;
    private String ciudadSede;

    public ActaCongreso(String titulo, String fechaPublicacion, List<String> autores, String simposio, String ciudadSede) {
        super(titulo, fechaPublicacion, autores);
        this.simposio = simposio;
        this.ciudadSede = ciudadSede;
    }

    @Override
    public String generarCita() {
        return "[IEEE] " + getAutoresTexto() + ", \"" + getTitulo() + "\", en " + simposio + ", " + ciudadSede + ", " + getFechaPublicacion() + ".";
    }
}
