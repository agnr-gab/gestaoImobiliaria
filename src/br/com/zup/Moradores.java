package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Moradores {
    private String nome;
    private String cpf;
    private String profissao;
    private double rendaBruta;

    private List<Imoveis> listaImoveis = new ArrayList<>();

    public Moradores(String nome, String cpf, String profissao, double rendaBruta) {
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

    public void adicionarImoveis(Imoveis imovel) {
        listaImoveis.add(imovel);
    }

    @Override
    public String toString() {
        StringBuilder retornoImoveis = new StringBuilder();

        retornoImoveis.append("\n Nome: " + getNome());
        retornoImoveis.append("\n CPF: " + getCpf());
        retornoImoveis.append("\n Profissão: " + getProfissao());
        retornoImoveis.append("\n Renda Bruta: " + getRendaBruta() + " reais");

        return retornoImoveis.toString();
    }
}


