import java.util.Date;

public class Persona {
    String nombre;
    String PrimerApellido;
    String SegundoApellido;
    String CI;
    Date fechaNacimiento;
    String Direccion;
    int Celular;
    int Telefono;
    String Email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int celular) {
        Celular = celular;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String CI, Date fechaNacimiento, String direccion, int celular, int telefono, String email) {
        this.nombre = nombre;
        PrimerApellido = primerApellido;
        SegundoApellido = segundoApellido;
        this.CI = CI;
        this.fechaNacimiento = fechaNacimiento;
        Direccion = direccion;
        Celular = celular;
        Telefono = telefono;
        Email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
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
