
import java.util.ArrayList;


public class UsuarioMantenimiento extends Usuarios {
    
    ArrayList<ATM> atms = new ArrayList();

    public UsuarioMantenimiento(int id, int transacciones, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String password, String nacimiento, String afiliacion, String user) {
        super(id, transacciones, primerNombre, segundoNombre, primerApellido, segundoApellido, password, nacimiento, afiliacion, user);
    }

    public ArrayList<ATM> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    @Override
    public String toString() {
        return "UsuarioMantenimiento{" + "atms=" + atms + '}';
    }
    
    
    
 
    
    

}
