package b;

public class ClasseTreinador extends ClassePessoas {
	
	String especialidadeAt;
	
	public ClasseTreinador(int idPar,  String nomePar, int idadePar, String especialidadePar){
		super(idPar, nomePar, idadePar);
		this.especialidadeAt=especialidadePar;
	}
}
