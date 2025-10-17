package b;

public class ClassePessoas {
	private int idAt;
	private String nomeAt;
	private int idadeAt;
	
	public ClassePessoas(){
		
	}
	
	public ClassePessoas(int idPar, String nomePar, int idadePar){
		this.idAt = idPar;
		this.idadeAt= idadePar;
		this.nomeAt= nomePar;
	}
	
	public int getId(){
		return idAt;}
	
	public String getNome(){
		return nomeAt;}
	
	public int getIdade(){
		return idadeAt;}
	
	
	public void setId(int Id){
		this.idAt= Id;}
	
	public void setNome(String Nome){
		this.nomeAt= Nome;}
	
	public void setIdade(int Idade){
		this.idadeAt= Idade;}
	
	public void exibirInfo(){
		System.out.println("ID: " + idAt);
        System.out.println("Nome: " + nomeAt);
        System.out.println("Idade: " + idadeAt);
	}
}
