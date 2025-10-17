package b;

public class ClasseAtleta extends ClassePessoas {

	 String modalidadeAt;
	
	public ClasseAtleta(int idPar,  String nomePar, int idadePar, String modalidadePar){
		super(idPar, nomePar, idadePar);
		this.modalidadeAt=modalidadePar;
	}
	@Override
	public void exibirInfo(){
		System.out.println("ID do Atleta: " + getId());
        System.out.println("Nome do Atleta: " + getNome());
        System.out.println("Idade do Atleta: " + getIdade());;
		
	}
}
