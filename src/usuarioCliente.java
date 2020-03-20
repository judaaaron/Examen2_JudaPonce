
public class usuarioCliente extends Usuarios {
    
    private Cuentas cuentas;

    public usuarioCliente() {
        super();
    }

    public usuarioCliente(Cuentas cuentas, int id, int transacciones, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String password, String nacimiento, String afiliacion) {
        super(id, transacciones, primerNombre, segundoNombre, primerApellido, segundoApellido, password, nacimiento, afiliacion);
        this.cuentas = cuentas;
    }

    public Cuentas getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "usuarioCliente{" + "cuentas=" + cuentas + '}';
    }
    
    
    
    
    


  
    
    
    
    
    
    

}
