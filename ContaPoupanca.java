public class ContaPoupanca extends Conta{

    public ContaPoupanca(int conta, Cliente cliente) {
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
