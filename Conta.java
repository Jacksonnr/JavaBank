public abstract class Conta {
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;

    public abstract boolean sacar(double valor);

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
        }
    }
}