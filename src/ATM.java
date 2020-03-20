
import java.io.Serializable;


public class ATM implements Serializable{
    
    private int cantidad;
    private LogSistema log;
    private int id;
    private String tiempo;
    private String Ubicacion, year;

    public ATM() {
    }

    public ATM(int cantidad, LogSistema log, int id, String tiempo, String Ubicacion, String year) {
        this.cantidad = cantidad;
        this.log = log;
        this.id = id;
        this.tiempo = tiempo;
        this.Ubicacion = Ubicacion;
        this.year = year;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LogSistema getLog() {
        return log;
    }

    public void setLog(LogSistema log) {
        this.log = log;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return Ubicacion;
    }
    
    
    
    
}
