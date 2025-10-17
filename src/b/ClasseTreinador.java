package b;

public class ClasseTreinador extends ClassePessoas {
	
	String especialidadeAt;
	
	public ClasseTreinador(int idPar,  String nomePar, int idadePar, String especialidadePar){
		super(idPar, nomePar, idadePar);
		this.especialidadeAt=especialidadePar;
		}
	@Override
	public void exibirInfo(){
		System.out.println("ID do Treinador: " + getId());
        System.out.println("Nome do Treinador: " + getNome());
        System.out.println("Idade do Treinador: " + getIdade());
	}
}