
import java.util.Date;


public class LogSistema {

    private String Usuario, descripcion;

    private Date fecha;

    public LogSistema() {
    }

    public LogSistema(String Usuario, String descripcion, Date fecha) {
        this.Usuario = Usuario;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "LogSistema{" + "Usuario=" + Usuario + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }
    
    

}
