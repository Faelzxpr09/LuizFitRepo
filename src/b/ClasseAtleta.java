package b;

public class ClasseAtleta extends ClassePessoas {

	 String modalidadeAt;
	 int treinosAt;
	
	public ClasseAtleta(int idPar,  String nomePar, int idadePar, String modalidadePar, int treinosPar){
		super(idPar, nomePar, idadePar);
		this.modalidadeAt=modalidadePar;
		this.treinosAt=treinosPar;
	}
	
	
	@Override
	public void exibirInfo(){
		System.out.println("ID do Atleta: " + getId());
        System.out.println("Nome do Atleta: " + getNome());
        System.out.println("Idade do Atleta: " + getIdade());
        System.out.println("Treinos: " + treinosAt);	
	}
	public int calcularDesempenho() {
        return treinosAt * 10;
}
}