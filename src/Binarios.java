    

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Binarios {

    private ArrayList<Usuarios> usuarios = new ArrayList();
    private File binario = new File("./usuarios");

    public Binarios() {
    }

    public Binarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Usuarios> getUsuario() {
        return usuarios;
    }

    public void setUsuario(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public File getBinario() {
        return binario;
    }

    public void setBinario(File binario) {
        this.binario = binario;
    }

    public void cargarBinario() {
        try {
            usuarios = new ArrayList();
            Usuarios users;
            if (binario.exists()) {
                FileInputStream of = new FileInputStream(binario);
                ObjectInputStream of2 = new ObjectInputStream(of);
                try {
                    while ((users = (Usuarios) of2.readObject()) != null) {
                     
                        usuarios.add(users);

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
            for (Usuarios o : usuarios) {
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

    public void agregarOfertador(Usuarios off) {
        usuarios.add(off);

    }

}
