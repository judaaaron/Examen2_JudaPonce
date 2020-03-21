
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminMantenimiento {

    private ArrayList<UsuarioMantenimiento> usis = new ArrayList();
    private File binario = new File("./mante.jpv");

    public adminMantenimiento() {
    }

    public adminMantenimiento(ArrayList<UsuarioMantenimiento> usis) {
        this.usis = usis;
    }

    public ArrayList<UsuarioMantenimiento> getMante() {
        return usis;
    }

    public void setMantenimiento(ArrayList<UsuarioMantenimiento> usis) {
        this.usis = usis;
    }

    public File getBinario() {
        return binario;
    }

    public void setBinario(File binario) {
        this.binario = binario;
    }

    public void cargarBinario() {
        try {
            usis = new ArrayList();
            UsuarioMantenimiento mantee;
            if (binario.exists()) {
                FileInputStream of = new FileInputStream(binario);
                ObjectInputStream of2 = new ObjectInputStream(of);
                try {
                    while ((mantee = (UsuarioMantenimiento) of2.readObject()) != null) {

                        usis.add(mantee);

                    }

                } catch (IOException | ClassNotFoundException e) {

                }
                of2.close();
                of.close();

            }
        } catch (IOException e) {

        }
    }

    public void escribirBinarios() {
        FileOutputStream pp = null;
        ObjectOutputStream pp2 = null;
        try {
            pp = new FileOutputStream(binario);
            pp2 = new ObjectOutputStream(pp);
            for (UsuarioMantenimiento o : usis) {
                pp2.writeObject(o);

            }
            pp2.flush();

        } catch (IOException e) {

        } finally {
            try {
                pp2.close();
                pp.close();
            } catch (IOException e) {

            }
        }

    }

    public void agregarMante(UsuarioMantenimiento off) {
        usis.add(off);

    }

}
