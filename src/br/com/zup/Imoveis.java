package br.com.zup;

public class Imoveis {
    private String enderecoImovel;
    private String valorImovel;
    private String moradorAtual;
    private String funcionarioResponsavel;

    public Imoveis(String enderecoImovel, String valorImovel, String moradorAtual, String funcionarioResponsavel) {
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
