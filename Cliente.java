import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private String senha;
    private ArrayList<Conta> contas = new ArrayList<>();


    public Cliente (String nome, String cpf, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.contas = new ArrayList<>();
    }

    public Conta adicionarConta(Conta conta){
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

}
