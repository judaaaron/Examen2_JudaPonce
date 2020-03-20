
import java.util.ArrayList;

public class usuarioCliente extends Usuarios {

    ArrayList<Cuentas> cuentas = new ArrayList();

    public usuarioCliente(int id, int transacciones, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String password, String nacimiento, String afiliacion, String user) {
        super(id, transacciones, primerNombre, segundoNombre, primerApellido, segundoApellido, password, nacimiento, afiliacion, user);
    }

   

    public ArrayList<Cuentas> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuentas> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "usuarioCliente{" + "cuentas=" + cuentas + '}';
    }

}
