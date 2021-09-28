package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Moradores {
    private String nome;
    private String cpf;
    private String profissao;
    private String rendaBruta;

    private List<Imoveis> listaImoveis = new ArrayList<>();
    public void adicionarImoveis(Imoveis imovel) {
        listaImoveis.add(imovel);
    }

    public Moradores(String nome, String cpf, String profissao, String rendaBruta) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.rendaBruta = rendaBruta;
    }
}
