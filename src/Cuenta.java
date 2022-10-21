
public class Cuenta {
    Usuario usuario;
    Rol rol;
    Boolean estado;

    public Cuenta(Usuario usuario, Rol rol, Boolean estado) {
        this.usuario = usuario;
        this.rol = rol;
        this.estado = estado;
    }
}
