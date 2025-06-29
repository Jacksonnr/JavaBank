import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private byte diaNascimento;
    private byte mesNascimento;
    private byte anoNascimento;
    private ArrayList<Conta> contas;

    public Cliente (String nome, String cpf, byte diaNascimento, byte mesNascimento, byte anoNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public byte getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(byte anoNascimento) {
        this.anoNascimento = anoNascimento;
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

    public byte getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(byte diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public byte getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(byte mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

}
