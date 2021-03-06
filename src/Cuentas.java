
import java.io.Serializable;

public class Cuentas implements Serializable {

    private int nCuenta, saldo;

    public Cuentas() {
    }

    public Cuentas(int nCuenta, int saldo) {
        this.nCuenta = nCuenta;
        this.saldo = saldo;

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

    @Override
    public String toString() {
        return "Cuentas{" + "nCuenta=" + nCuenta + ", saldo=" + saldo;
    }

}
