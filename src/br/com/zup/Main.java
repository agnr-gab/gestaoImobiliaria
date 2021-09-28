package br.com.zup;
/*
Os alunos/alunas devem criar um sistema de gestão para uma imobiliária. O sistema deve permitir o cadastro de um imóvel e de todos os seus moradores. Ao final do programa, deve ser exibido o endereço do imóvel, o valor do aluguel, quais são seus moradores e o nome do funcionário responsável pelo imóvel.
1.Entrega Mínima: O sistema permite cadastrar um imóvel com valor do aluguel, endereço, os moradores e o funcionário responsável. No final, o sistema deve exibir os dados do imóvel.
2. Entrega Máxima: O sistema permite adicionar mais de um imóvel e exibir a lista de imóveis.
 */
public class Main {

    public static void main(String[] args) {
	Moradores morador1 = new Moradores("Maria","000.000.000-00","Arquiteta de Software",8500, "55-61-999-999-999");
	Funcionario funcionario1 = new Funcionario("Marina", "111.111.111-88", "Corretora de Imóveis", 5000, "123654-8");
	Imoveis imovel1 = new Imoveis("Rua Antônio Xavier 36 Centro Bom Jesus RN 59270-970", "230000","João", "Pedro");

		System.out.println(morador1);
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println(funcionario1);
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println(imovel1);

    }
}
