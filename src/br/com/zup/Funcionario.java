package br.com.zup;

public class Funcionario extends Pessoa {
    private String ctps;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String profissao, double rendaBruta, String ctps) {
        super(nome, cpf, profissao, rendaBruta);
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    @Override
    public String toString() {
        StringBuilder retornoFuncionario = new StringBuilder();
        retornoFuncionario.append(super.toString());
        retornoFuncionario.append("Carteira de Trabalho " + ctps);
        return retornoFuncionario.toString();
    }
}
