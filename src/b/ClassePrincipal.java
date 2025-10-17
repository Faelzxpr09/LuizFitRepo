package b;

public class ClassePrincipal {

	public static void main(String[] args) {
		ClassePessoas pessoa = new ClassePessoas(1, "João", 25);
		ClasseAtleta atleta = new ClasseAtleta(1, "Alana", 17, "100M", 5);
		ClasseTreinador treinador = new ClasseTreinador(3, "Julio", 23, "Atletismo", 8);

		System.out.println("Informações da Pessoa:");
        pessoa.exibirInfo();

        System.out.println("\nInformações do Atleta:");
        atleta.exibirInfo();

        System.out.println("\nInformações do Treinador:");
        treinador.exibirInfo();
	}

}
