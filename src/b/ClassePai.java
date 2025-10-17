package b;

public class ClassePai {
	private int idAt;
	private String nomeAt;
	private int idadeAt;
	
	public ClassePai(){
		
	}
	
	public ClassePai(int idPar, String nomePar, int idadePar){
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
}
