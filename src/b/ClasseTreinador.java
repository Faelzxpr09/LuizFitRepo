package b;

public class ClasseTreinador extends ClassePessoas {
	
	String especialidadeAt;
	int alunosAt;
	
	public ClasseTreinador(int idPar,  String nomePar, int idadePar, String especialidadePar, int alunosPar){
		super(idPar, nomePar, idadePar);
		this.especialidadeAt=especialidadePar;
		this.alunosAt=alunosPar;
		}
	@Override
	public void exibirInfo(){
		System.out.println("ID do Treinador: " + getId());
        System.out.println("Nome do Treinador: " + getNome());
        System.out.println("Idade do Treinador: " + getIdade());
        System.out.println("Alunos: " + alunosAt);
	}
	public int calcularDesempenho() {
        return alunosAt * 5;
}
}