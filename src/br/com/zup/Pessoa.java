package br.com.zup;

public class Pessoa {
    private String nome;
    private String cpf;
    private String profissao;
    private double rendaBruta;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String profissao, double rendaBruta) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.rendaBruta = rendaBruta;
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    @Override
    public String toString() {
        StringBuilder retornoPessoa = new StringBuilder();

        retornoPessoa.append("\n Nome: " + getNome());
        retornoPessoa.append("\n CPF: " + getCpf());
        retornoPessoa.append("\n Profissão: " + getProfissao());
        retornoPessoa.append("\n Renda Bruta: " + getRendaBruta() + " reais");

        return retornoPessoa.toString();
    }
}
