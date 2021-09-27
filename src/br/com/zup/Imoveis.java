package br.com.zup;

public class Imoveis {
    private String enderecoImovel;
    private String valorImovel;
    private String moradorAtual;
    private String funcionarioResponsavel;

    @Override
    public String toString() {
        StringBuilder dadosImovel = new StringBuilder();
        dadosImovel.append("\nEndereço: " + enderecoImovel);
        dadosImovel.append("\nValor: R$ " + valorImovel);
        dadosImovel.append("\nMorador atual: " + moradorAtual);
        dadosImovel.append("\nFuncionário responsável: " + funcionarioResponsavel);
        return dadosImovel.toString();
    }
}
