public class ContaCorrente extends Conta {


    public ContaCorrente(int conta, Cliente cliente) {
        super(conta, cliente);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
