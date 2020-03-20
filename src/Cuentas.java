
import java.io.Serializable;


public class Cuentas implements Serializable{

    private int nCuenta, saldo, id;

    public Cuentas() {
    }

    public Cuentas(int nCuenta, int saldo, int id) {
        this.nCuenta = nCuenta;
        this.saldo = saldo;
        this.id = id;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "nCuenta=" + nCuenta + ", saldo=" + saldo + ", id=" + id + '}';
    }
    
    

}
