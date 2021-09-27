package br.com.zup;

import java.util.ArrayList;
import java.util.List;

/*
endereço do imóvel, o valor do aluguel, quais são seus moradores e o nome do funcionário responsável pelo imóvel
 */
public class Imovel {
    private String enderecoImovel;
    private String valorImovel;
    private String moradorAtual;
    private String funcionarioResponsavel;

    private List<Moradores> listaMoradores = new ArrayList<>();

    public Imovel(String enderecoImovel, String valorImovel, String moradorAtual, String funcionarioResponsavel) {
        this.enderecoImovel = enderecoImovel;
        this.valorImovel = valorImovel;
        this.moradorAtual = moradorAtual;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public String getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(String valorImovel) {
        this.valorImovel = valorImovel;
    }

    public String getMoradorAtual() {
        return moradorAtual;
    }

    public void setMoradorAtual(String moradorAtual) {
        this.moradorAtual = moradorAtual;
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public void adicionarMoradores(Moradores morador) {
        listaMoradores.add(morador);
    }
}