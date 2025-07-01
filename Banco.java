import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Conta> contas = new ArrayList<>();
    private int proximoNumeroConta = 1001;

    public Cliente criarCliente(String nome, String cpf, String senha) {
        Cliente cliente = new Cliente(nome, cpf, senha);
        clientes.add(cliente);
        return cliente;
    }

    public Conta criarConta(Cliente cliente, String tipo) {
        Conta conta = null;
        if (tipo.equals("corrente")) {
            conta = new ContaCorrente(proximoNumeroConta++, cliente);
        } else if (tipo.equals("poupança")) {
            conta = new ContaPoupanca(proximoNumeroConta++, cliente);
        } else {
            System.out.println("Favor informar um tipo válido de conta. ");
            return null;
        }
        contas.add(conta);
        cliente.adicionarConta(conta);
        return conta;
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    // Outros métodos: listar contas, movimentações, etc.
}
