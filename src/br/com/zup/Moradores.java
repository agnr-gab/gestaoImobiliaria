package br.com.zup;

public class Moradores extends Pessoa {
    private String telefone;

    public Moradores() {

    }

    public Moradores(String nome, String cpf, String profissao, double rendaBruta, String telefone) {
        super(nome, cpf, profissao, rendaBruta);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        StringBuilder retornoMorador = new StringBuilder();
        retornoMorador.append(super.toString());
        retornoMorador.append("Telefone de Contato: " + telefone);
        return retornoMorador.toString();
    }
}


