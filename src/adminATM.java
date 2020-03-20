
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminATM {

    private ArrayList<ATM> atms = new ArrayList();
    private File binario = new File("./ATM.jpv");

    public adminATM() {
    }

    public adminATM(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    public ArrayList<ATM> getATM() {
        return atms;
    }

    public void setUsuario(ArrayList<Usuarios> usuarios) {
        this.atms = atms;
    }

    public File getBinario() {
        return binario;
    }

    public void setBinario(File binario) {
        this.binario = binario;
    }

    public void cargarBinario() {
        try {
            atms = new ArrayList();
            ATM atm;
            if (binario.exists()) {
                FileInputStream of = new FileInputStream(binario);
                ObjectInputStream of2 = new ObjectInputStream(of);
                try {
                    while ((atm = (ATM) of2.readObject()) != null) {

                        atms.add(atm);

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
            for (ATM o : atms) {
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

    public void agregarATM(ATM off) {
        atms.add(off);

    }

}
