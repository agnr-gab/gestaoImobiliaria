package br.com.zup;

import java.util.ArrayList;
import java.util.List;

/*
endereço do imóvel, o valor do aluguel, quais são seus moradores e o nome do funcionário responsável pelo imóvel
 */
public class Imobiliaria{

    private List<Imoveis> listaImoveis = new ArrayList<>();
    public void adicionarImoveis(Imoveis imovel) {
        listaImoveis.add(imovel);
    }

    public List<Imoveis> getListaImoveis() {
        return listaImoveis;
    }
}