import java.util.Date;

public class Docente extends Usuario {
    public Docente(String nombre, String primerApellido, String segundoApellido, String CI, Date fechaNacimiento, String direccion, int celular, int telefono, String email) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direccion, celular, telefono, email);
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nombre='" + nombre + '\'' +
                ", PrimerApellido='" + PrimerApellido + '\'' +
                ", SegundoApellido='" + SegundoApellido + '\'' +
                ", CI='" + CI + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", Direccion='" + Direccion + '\'' +
                ", Celular=" + Celular +
                ", Telefono=" + Telefono +
                ", Email='" + Email + '\'' +
                '}';
    }
}