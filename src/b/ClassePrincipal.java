package b;

public class ClassePrincipal {

	public static void main(String[] args) {
		ClassePessoas pessoa = new ClassePessoas(1, "Jo�o", 25);
		ClasseAtleta atleta = new ClasseAtleta(1, "Alana", 17, "100M", 5);
		ClasseTreinador treinador = new ClasseTreinador(3, "Julio", 23, "Atletismo", 8);

		System.out.println("Informa��es da Pessoa:");
        pessoa.exibirInfo();

        System.out.println("\nInforma��es do Atleta:");
        atleta.exibirInfo();

        System.out.println("\nInforma��es do Treinador:");
        treinador.exibirInfo();
	}

}
