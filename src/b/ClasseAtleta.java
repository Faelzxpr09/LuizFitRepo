package b;

public class ClasseAtleta extends ClassePessoas {

	 String modalidadeAt;
	
	public ClasseAtleta(int idPar,  String nomePar, int idadePar, String modalidadePar){
		super(idPar, nomePar, idadePar);
		this.modalidadeAt=modalidadePar;
	}
}
