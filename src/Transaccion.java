
import java.util.Date;

public class Transaccion {

    private int nCuenta, id;
    private String descripcion;
    private Date fecha;

    public Transaccion() {
    }

    public Transaccion(int nCuenta, int id, String descripcion, Date fecha) {
        this.nCuenta = nCuenta;
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Transaccion{" + "nCuenta=" + nCuenta + ", id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }

}
