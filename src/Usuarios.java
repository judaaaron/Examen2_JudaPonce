
import java.io.Serializable;


public class Usuarios implements Serializable{
    private int id, transacciones;
    private String primerNombre, segundoNombre, primerApellido, segundoApellido, password, nacimiento, afiliacion, user;
    

    public Usuarios() {
    }

    public Usuarios(int id, int transacciones, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String password, String nacimiento, String afiliacion, String user) {
        this.id = id;
        this.transacciones = transacciones;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.password = password;
        this.nacimiento = nacimiento;
        this.afiliacion = afiliacion;
        this.user= user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", transacciones=" + transacciones + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", password=" + password + ", nacimiento=" + nacimiento + ", afiliacion=" + afiliacion + ", user=" + user + '}';
    }
    
    

  
    
    
           
    
}
